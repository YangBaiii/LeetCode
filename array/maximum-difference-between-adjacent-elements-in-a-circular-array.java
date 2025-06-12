class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans = Math.abs(nums[0] - nums[nums.length-1]);
        for (int i = 1; i < nums.length - 1; i++) {
            int left = Math.abs(nums[i] - nums[i-1]);
            int right = Math.abs(nums[i] - nums[i+1]);
            ans = Math.max(Math.max(left, right), ans);
        }
        return ans;
    }
}