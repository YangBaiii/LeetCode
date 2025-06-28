class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k], topKIndices = new int[k];
        int[][] pairs = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            pairs[i] = new int[]{nums[i], i}; 
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        for (int i = 0; i < k; i++) {
            topKIndices[i] = pairs[i][1];
        }
        Arrays.sort(topKIndices);
        for (int i = 0; i < k; i++) {
            ans[i] = nums[topKIndices[i]];
        }

        return ans;
    }
}
