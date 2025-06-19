class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0, i = 0;
        while (i < nums.length) {
            int start = nums[i];  
            ans++;  
            i++;
            while (i < nums.length && nums[i] <= start + k) {
                i++;  
            }
        }
        return ans;
    }
}
