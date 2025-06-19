class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1, min = 1_000_000_001;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, nums[i] - min);
            min = Math.min(min, nums[i]);
        }
        return ans;
    }
}