class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        int ans = 0;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c-'a']++;
        for (int i = 0; i < t; i++) {
            int temp[] = new int[26];
            for (int j = 0; j < 25; j++) {
                temp[j+1] = freq[j];
            }
            temp[0] = (temp[0] + freq[25]) % MOD;
            temp[1] = (temp[1] + freq[25]) % MOD;
            // 'y': split into index 0 and 1
            freq = temp;
    }
        for (int i : freq) ans = (ans + i) % MOD;
        return ans;
    }
}