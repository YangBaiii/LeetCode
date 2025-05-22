class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = 100001, count = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            count += nums[r];
            while (count >= target) {
                ans = Math.min(ans, r - l + 1);
                count -= nums[l++];
            }
        }
        return ans == 100001 ? 0 : ans;
    }
}