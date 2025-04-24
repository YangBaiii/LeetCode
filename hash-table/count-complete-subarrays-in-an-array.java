class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0, max = 0;
        for (int i : nums) {
            set.add(i);
        }
        max = set.size();
        set.clear();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == max) {
                    ans += nums.length - j;
                    break;
                }
            }
            set.clear();
        }
        return ans;
    }
}