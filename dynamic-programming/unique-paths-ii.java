class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) dp[i][0] = grid[i][0] == 1 ? 0 : 1;
        for (int i = 0; i < col; i++) dp[0][i] = grid[0][i] == 1 ? 0 : 1;

        for (int i = 1; i < col; i++) {
            for (int j = 1; j < row; j++) {
                dp[i][j] = grid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[row-1][col-1];
    }
}