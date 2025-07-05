class Solution {
    public int findLucky(int[] arr) {
        int ans = -1;
        int[] freq = new int[501];
        for (int i : arr) {
            freq[i]++;
        }   
        for (int i : freq) {
            if (freq[i] > 0 && i == freq[i]) ans = Math.max(ans, i);
        }
        return ans;
    }
}