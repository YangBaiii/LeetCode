class Solution {
    public int minOperations(int[] nums) {
        int count = 0, last = nums.length-3;
        for (int i = 0; i < last; i++) {
            if(nums[i] == 0) {
                count++;
                nums[i+1] = nums[i+1] == 0 ? 1 : 0;
                nums[i+2] = nums[i+2] == 0 ? 1 : 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            if(nums[last+i] != nums[last+i+1]) return -1;
        }
        return nums[last] == 1 ? count : count + 1;
    }
}