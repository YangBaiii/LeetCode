class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (int[] d : dominoes) {
            int a = d[0], b = d[1];
            int product = a * b;
            int diff = Math.abs(a - b);
            String key = product + "_" + diff;
            int count = map.getOrDefault(key, 0);
            ans += count;
            map.put(key, count + 1);
        }
        return ans;
    }
}