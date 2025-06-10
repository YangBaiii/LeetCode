class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int odd = Integer.MIN_VALUE, even = Integer.MAX_VALUE;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 == 0) even = Math.min(map.get(c), even);
            else odd = Math.max(map.get(c), odd);
        }
        return odd - even;
    }
}