class Solution {
    public int differenceOfSums(int n, int m) {
        int count = n / m;
        int num2 = count * m + count * (count - 1) * m / 2;
        int sum = (n + 1) * n / 2;
        return sum - 2 * num2;
    }
}