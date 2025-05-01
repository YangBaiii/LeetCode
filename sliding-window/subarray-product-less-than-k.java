class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int ans = 0, left = 0, product = 1;
        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while (left <= right && product >= k) {
                product /= nums[left++];
            }
            ans += right - left + 1;
        }
        return ans;
    }
}