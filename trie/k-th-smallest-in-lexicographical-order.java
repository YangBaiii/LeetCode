class Solution {
    int count = 0;
    int result = 0;

    public int findKthNumber(int n, int k) {
        for (int i = 1; i <= 9 && i <= n; i++) {
            dfs(i, n, k);
            if (result != 0) break;
        }
        return result;
    }

    private void dfs(int cur, int n, int k) {
        if (cur > n || result != 0) return;
        count++;
        if (count == k) {
            result = cur;
            return;
        }
        for (int i = 0; i <= 9; i++) {
            dfs(cur * 10 + i, n, k);
        }
    }
}
