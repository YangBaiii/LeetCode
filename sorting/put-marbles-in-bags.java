class Solution {
    public long putMarbles(int[] W, int k) {
        int n = W.length;
        if (k == n) return 0;
        for (int i = 1; i < n; i++) W[i-1] = W[i] + W[i-1];
        W[n-1] = Integer.MAX_VALUE;
        Arrays.sort(W);

        long res = 0L;

        for (int i = 0; i < k-1; i++)
            res += W[n-2-i] - W[i];

        return res;
    }
}