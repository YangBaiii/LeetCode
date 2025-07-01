class Solution {
public:
    int findLHS(vector<int>& nums) {
        unordered_map<int,int>map;
        int ans = 0;
        for (auto i : nums) {
            map[i]++;
            if (map.count(i+1)) {
                ans = max(ans, map[i] + map[i+1]);
            } else if (map.count(i-1)) {
                ans = max(ans, map[i] + map[i-1]);
            }
        }
        return ans;
    }
};