class Solution {
    public int numRabbits(int[] answers) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : answers) map.put(i, map.getOrDefault(i, 0) + 1);
        for (int key : map.keySet()) {
            int value = map.get(key);
            int groupSize = key + 1;
            int group = (key + value) / groupSize;
            ans += group * groupSize;
        }
        return ans;
    }
}