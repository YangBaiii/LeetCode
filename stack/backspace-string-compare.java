class Solution {
    public boolean backspaceCompare(String s, String t) {
        return afterProcessed(s).equals(afterProcessed(t));
    }

    public String afterProcessed(String s) {
        char[] arr = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                arr[index++] = s.charAt(i);
            } else {
                index--;;
            }
        }
        index = index >= 0 ? index : 0;
        return new String(Arrays.copyOfRange(arr, 0, index));
    }
}