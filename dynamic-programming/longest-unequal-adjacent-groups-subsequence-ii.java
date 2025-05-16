class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        List<String> ans = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            int[] arr = new int[len];
            String str = words[i];
            list.add(groups[i]);
            for (int j = 0; j < str.length(); j++) {
                for (int k = i + 1; k < len; k++) {
                if (groups[i] != groups[k] && str.length() != words[k].length()) {
                    arr[k] = 2;
                    continue;
                }
                else if(j < words[k].length() && words[k].charAt(j) != str.charAt(j)) arr[k]++; 
             }
            }
            for (int g = i + 1; g < len; g++) {
                if (!list.contains(groups[g]) && arr[g] == 1) {
                    if (ans.isEmpty()) ans.add(str);
                    ans.add(words[g]);
                    list.add(groups[g]);
                }
            }
            if (!ans.isEmpty()) return ans;
            list.clear();
         }
         ans.add(words[0]);
         return ans;
    }
}