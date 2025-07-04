class Solution {
public:
    char kthCharacter(int k) {
        std::string s = "a";
        while (s.length() < k) {
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char c = 'a' + (s.at(i) - 'a' + 1) % 26;
                s += c;
            }
        }
        return s.at(k-1);
    }
};