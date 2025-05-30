class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = nums[i], left = i + 1, right = nums.length - 1;
            if (count > 0) return ans;
            List<Integer> list = new ArrayList<>();
            list.add(count);
            while (right > left) {
                if (count + nums[left] + nums[right] == 0) {
                    list.add(nums[left]);
                    list.add(nums[right]);
                    if(!ans.contains(list)) ans.add(list);
                    break;
                } else if (count + nums[left] + nums[right] > 0) right--;
                else left++;
            }
        }
        return ans;
    }
}