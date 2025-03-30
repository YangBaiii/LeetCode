class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new LinkedList<>();
        int max = 0, prev = -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, i);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            max = Math.max(max, map.get(c));
            if(max == i) {
                ans.add(max - prev);
                prev = i;
            }
        }
        return ans;
    }
}