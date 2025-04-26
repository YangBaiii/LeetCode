class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0, lastBad = -1, lastMin = -1, lastMax = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) lastBad = i;
            if (nums[i] == minK) lastMin = i;
            if(nums[i] == maxK) lastMax = i;
            ans += Math.max(0, Math.min(lastMin, lastMax) - lastBad);
        }
        return ans;
    }
}