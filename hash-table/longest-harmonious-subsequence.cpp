class Solution {
public:
    int findLHS(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int ans = 0, min = 0;
        for (auto i = 0; i < nums.size();) {
            if (nums[i] == nums[min]) i++;
            else if (nums[i] - nums[min] == 1) {
                ans = max(ans, i - min + 1);
                i++;
            } else min++;
        }
        return ans;
    }
};