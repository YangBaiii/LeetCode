class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = 10001, ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int count = nums[i] + nums[left] + nums[right];
                ans = ans == 0 ? count : ans;
                if (Math.abs(count - target) < diff) {
                    ans = count;
                    diff = Math.abs(count - target);
                } 
                if (count == target) return count;
                else if (count < target) left++;
                else right--;
            }
        }
        return ans;
    }
}