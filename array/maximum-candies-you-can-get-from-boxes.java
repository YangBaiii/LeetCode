class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int ans = 0, n = candies.length;
        boolean[] usedBoxes = new boolean[n]; 
        boolean[] boxFound = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i : initialBoxes) {
            queue.add(i);
            boxFound[i] = true;
        }
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            if (status[cur] == 1 && !usedBoxes[cur]) {
                ans += candies[cur];
                usedBoxes[cur] = true;
                for (int i : keys[cur]) {
                    status[i] = 1;
                    if (boxFound[i]) queue.add(i);
                }
                for (int i : containedBoxes[cur]) {
                    boxFound[i] = true;
                    queue.add(i);
                }
            }
        }
        return ans;
    }
}