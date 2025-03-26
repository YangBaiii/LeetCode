class Solution {
    public int minOperations(int[][] grid, int x) {
        int ans = 0, row = grid.length, col = grid[0].length;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int target = list.get((list.size() - 1) / 2);
        for (int i = 0; i < list.size(); i++) {
            int diff = Math.abs(target - list.get(i));
            if (diff % x != 0) return -1;
            ans += diff / x;
        }
        return ans;
    }
}