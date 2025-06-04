class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) return sb.toString();
                if (j == 0) {
                    c = strs[j].charAt(i);
                    continue;
                } 
                if (strs[j].charAt(i) != c) return sb.toString();
            }
            sb.append(c);
            c = ' ';
        }
        return sb.toString();
    }
}