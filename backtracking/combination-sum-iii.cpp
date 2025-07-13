class Solution {
public:
    vector<vector<int>> ans;
    vector<int> path;
    vector<vector<int>> combinationSum3(int k, int n) {
        backtrack(1, 0, n, k);
        return ans;
    }

    void backtrack(int begin, int sum, int n, int k) {
        if (sum > n) { 
            return; 
        }
        if (path.size() == k) {
            if (sum == n) ans.push_back(path);
            return; 
        }
        for (; begin <= 9 - (k - path.size()) + 1; begin++) {
            sum += begin;
            path.push_back(begin);
            backtrack(begin+1, sum, n, k);
            sum -= begin;
            path.pop_back();
        }
    }
};