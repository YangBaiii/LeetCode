class Solution {
    public int countGoodNumbers(long n) {
        int mod = (int) 1e9+7;
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;
        long evenSum = power(5, evenCount, mod);
        long oddSum = power(4, oddCount, mod);
        return (int) (oddSum * evenSum % mod);
    }

    // Divide and Conquer
    public long power(long base, long exp, int mod) {
         if(exp == 0) return 1;
        long temp = power(base, exp/2, mod);
        // temp = pow(x, y/2)
        // If y is even, x power y = pow(x, y/2) * pow(x, y/2)
        // If y is odd, x power y = pow(x, y/2) * pow(x, y/2) * x
        if((exp & 1) == 0) {
            return (temp * temp) % mod;
        } else {
            return (temp * temp * base) % mod;
        }
    }
}