class Solution {
    public int countDays(int days, int[][] meetings) {
        int ans = 0, lastRight = 1;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for (int[] subArray : meetings) {
            pq.offer(subArray);
        }
        while (!pq.isEmpty()) {
            int[] sub = pq.poll();
            ans += sub[0] > lastRight ? sub[0] - lastRight : 0;
            lastRight = sub[1] + 1;
        }
        return lastRight <= days ? ans + days - lastRight + 1 : ans;
    }
}