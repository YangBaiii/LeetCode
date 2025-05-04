class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int[] D : dominoes) {
           int count = Math.min(D[0], D[1]) * 10 + Math.max(D[0], D[1]);
           map.put(count, map.getOrDefault(count, 0) + 1);
        }
        for (int v : map.values()) {
            ans += v * (v - 1) / 2;
        }
        return ans;
    }
}