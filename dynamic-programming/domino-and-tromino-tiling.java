class Solution {
    // dp[i-1] and dp[i-2] has one way to be dp[i]
    // dp[i-3] to dp[0] (1) has two way
    // dp[n] = dp[n-1] + dp[n-2] + 2 * (dp[n-3] + ... + dp[0]) -- E1
    // dp[n-1] = dp[n-2] + dp[n-3] + 2 * (dp[n-4] + ... + dp[0]) -- E2
    // E1 - E2:
    // dp[n] - dp[n-1] = dp[n-1] + dp[n-3]
    // --> dp[n] = 2*dp[n-1] + dp[n-3]
    public int numTilings(int n) {
        long[] dp = new long[1001];
        int mod = 1000000007;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i <= n; i++) {
            dp[i] = 2 * dp[i-1] + dp[i-3];
            dp[i] %= mod;
        }
        return (int)dp[n];
    }
}