class Solution {
public:
    vector<vector<int>> highFive(vector<vector<int>>& items) {
        unordered_map<int, vector<int>> map;
        for (auto& item : items) {
            map[item[0]].push_back(item[1]);
        }
        
        vector<vector<int>> result;
        for (auto& entry : map) {
            vector<int>& scores = entry.second;
            sort(scores.begin(), scores.end(), greater<int>()); 
            
            int sum = 0;
            int count = min(5, (int)scores.size());
            for (int i = 0; i < count; i++) {
                sum += scores[i];
            }
            int avg = sum / count; 
            
            result.push_back({entry.first, avg});
        }
        
        sort(result.begin(), result.end());
        return result;
    }
};