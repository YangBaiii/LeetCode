class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                int left = map.containsKey(i-1) ? map.get(i-1) : 0;
                int right = map.containsKey(i+1) ? map.get(i+1) : 0;
                int v = left + right + 1;
                ans = Math.max(ans, v);
                map.put(i-left, v);
                map.put(i+right, v);
            }
        }
        return ans;
    }
}