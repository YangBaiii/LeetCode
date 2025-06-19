class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length/3][3];
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=3) {
            if (nums[i+2] - nums[i] > k) return new int[0][0];
            else {
                int[] triplet = {nums[i], nums[i+1], nums[i+2]};
                ans[count++] = triplet;
            }
        }
        return ans;
    }
}