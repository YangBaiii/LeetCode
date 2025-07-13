class Solution {
public:
    vector<vector<string>> ans;
    vector<string> path;
    vector<vector<string>> partition(string s) {
        backtrack(s, 0);
        return ans;
    }

    void backtrack (string s, int start) {
        if (start == s.length()) {
            ans.push_back(path);
            return;
        }
        for (int i = start; i <= s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                string substr = s.substr(start, i - start + 1);
                path.push_back(substr);
                backtrack(s, i+1);  
                path.pop_back();   
            }
        }
    }

    bool isPalindrome (string s, int begin, int end) {
        string str = s.substr(begin, end - begin + 1);
        string temp = str;
        reverse(str.begin(), str.end());
        return temp==str;
    }
};