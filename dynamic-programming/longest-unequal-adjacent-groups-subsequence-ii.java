class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        int len = words.length;

        for (int i = 0; i < len; i++) {
            List<String> temp = new ArrayList<>();
            Set<Integer> seen = new HashSet<>();
            String str = words[i];
            temp.add(str);
            seen.add(groups[i]);

            for (int j = i + 1; j < len; j++) {
                if (groups[j] != groups[i] &&
                    words[j].length() == str.length() &&
                    diffByOne(str, words[j]) &&
                    !seen.contains(groups[j])) {

                    temp.add(words[j]);
                    seen.add(groups[j]);
                    str = words[j];
                }
            }

            if (temp.size() > ans.size()) {
                ans = temp;
            }
        }

        return ans.isEmpty() ? List.of(words[0]) : ans;
    }

    private boolean diffByOne(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}
