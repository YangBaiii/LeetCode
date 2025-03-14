class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 1, right = 10000000;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long childrenCount = 0;

            for (int candy : candies) {
                childrenCount += candy / mid;
            }

            if (childrenCount >= k) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}