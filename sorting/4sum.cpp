class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] > target && target >= 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums[i] + nums[j] > target && nums[i] + nums[j] >= 0) break;
                if (j > i + 1 && nums[j] == nums[j-1]) continue;
                int left = j + 1, right = nums.size() - 1, cur = nums[i] + nums[j];
                while (right > left) {
                    if (cur + nums[left] + nums[right] > target) right--;
                    else if (cur + nums[left] + nums[right] < target) left++;
                    else {
                        ans.push_back(vector<int>{nums[i], nums[j], nums[left], nums[right]});
                        while (left < right && nums[right] == nums[right-1]) right--;
                        while (left < right && nums[left] == nums[left+1]) left++;
                        right--; left++;
                    }
                }
            } 
        }
        return ans;
    }
};