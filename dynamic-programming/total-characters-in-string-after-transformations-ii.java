class Solution {
    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        final int MOD = 1_000_000_007;
        int ans = 0;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c-'a']++;
        for (int i = 0; i < t; i++) {
            int[] temp = new int[26];
            for (int j = 0; j < 26; j++) {
                int sum = 0;
                for (int k = j + 1; k <= j + nums.get(j); k++) {
                    int index = k > 25 ? k - 26 : k;
                    temp[index] = (temp[index] + freq[j]) % MOD;
                }
            }
            freq = temp;
        }
        for (int i : freq) ans = (ans + i) % MOD;
        return ans;
    }
}