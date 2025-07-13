class Solution {
public:
    vector<vector<int>> ans; 
    vector<int> path;
    vector<vector<int>> combine(int n, int k) {
        backtrack(1, k, n);
        return ans;
    }

    void backtrack(int start, int k, int n) {
        if (path.size() == k) {
                ans.push_back(path);
                return;
            }
        for (int i = start; i <= n; i++) {
            path.push_back(i);
            backtrack(i + 1, k, n);
            path.pop_back();
        }
    }
};