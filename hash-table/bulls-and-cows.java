class Solution {
    public String getHint(String secret, String guess) {
        int[] count1 = new int[10];
        int[] count2 = new int[10];
        int bull = 0, cow = 0;
        for (int i = 0; i < secret.length(); i++) {
            char c1 = secret.charAt(i);
            char c2 = guess.charAt(i);
            if (c1 == c2) {
                bull++;
                continue;
            }
            count1[c1 - '0']++;
            count2[c2 - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            cow += Math.min(count1[i], count2[i]);
        }
        return bull + "A" + cow + "B";
    }
}