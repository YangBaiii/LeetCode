class Solution {
    public String countAndSay(int n) {
        return RLE("1", n-1);
    }

    public String RLE(String str, int n) {
        if(n == 0) return str;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                sb.append(count);
                sb.append(str.charAt(i-1));
                count = 1;
            }
        }
        return RLE(sb.toString(), n-1);
    }
}