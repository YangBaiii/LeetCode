class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            int end = Math.min(i + k, s.length());
            StringBuilder sb = new StringBuilder(s.substring(i, end));
            ans.append(sb.reverse());

            if (end < s.length()) {
                int nextEnd = Math.min(end + k, s.length());
                ans.append(s.substring(end, nextEnd));
            }
        }
        return ans.toString();
    }
}
