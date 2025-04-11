class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            String s = Integer.toString(i);
            if(s.length()%2 != 0) continue;
            int left = 0, right = 0;
            for (int j = 0; j < s.length() / 2; j++) {
                left += s.charAt(j) - '0';
            }
            for (int k = s.length() / 2; k < s.length(); k++) {
                right += s.charAt(k) - '0';
            }
            if (left == right) ans++;
        }
        return ans;
    }
}