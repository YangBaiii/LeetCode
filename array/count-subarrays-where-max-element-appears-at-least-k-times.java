class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int max = 0, left = 0, count = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) count++;
            while (count >= k) {
                if (nums[left] == max) count--;
                left++;
            }
            ans += left;
        }
        return ans;
    }
}