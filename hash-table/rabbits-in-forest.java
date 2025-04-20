class Solution {
    public int numRabbits(int[] answers) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : answers) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int key : map.keySet()) {
            int value = map.get(key);
            while (value > 0) {
                ans += key + 1;
                value -= key + 1;
            }
        }
        return ans;
    }
}