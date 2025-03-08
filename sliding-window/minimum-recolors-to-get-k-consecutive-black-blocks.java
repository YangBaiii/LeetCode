class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = 0, count = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') ans++;
        }
        count = ans;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'B' && blocks.charAt(i-k) == 'W') {
                count--;
                ans = Math.min(count, ans);
            }
            else if ((blocks.charAt(i) == 'W' && blocks.charAt(i-k) == 'B')){
                count++;
            }
        }
        return ans;
    }
}