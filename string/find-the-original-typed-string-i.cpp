class Solution {
public:
    int possibleStringCount(string word) {
        int ans = 1;
        for (int i = 1; i < word.size(); i++) {
            while (i < word.size() && word.at(i) == word.at(i-1)) {
                i++;
                ans++;
            }
        }
        return ans;
    }
};