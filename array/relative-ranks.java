class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> score[b] - score[a]);
        int rank = 1;
        for (int i = 0; i < score.length; i++) pq.offer(i);
        String[] ans = new String[score.length];
        while(!pq.isEmpty()) {
            int i = pq.poll();
            if(rank == 1) ans[i] = "Gold Medal";
            else if(rank == 2) ans[i] = "Silver Medal";
            else if(rank == 3) ans[i] = "Bronze Medal";
            else ans[i] = Integer.toString(rank);
            rank++;
        }
        return ans;
    }
}