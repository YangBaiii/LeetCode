class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            StringBuilder sb = new StringBuilder(s.substring(i,i+k));
            ans.append(sb.reverse());
            ans.append(s.substring(i+k, Math.min(i+k+k, s.length())));
        }
        return ans.toString();
    }
}