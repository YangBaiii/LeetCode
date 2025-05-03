class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans1 = 0, ans2 = 0, target1 = tops[0], target2 = bottoms[0];
        for (int i = 1; i < tops.length; i++) {
            if (target1 > 0 && tops[i] != target1 && bottoms[i] == target1) {
                ans1++;
            } 
            if (target2 > 0 && bottoms[i] != target2 && tops[i] == target2) {
                ans2++;
            }
            if (tops[i] != target1 && bottoms[i] != target1) {
                target1 = 0;
                ans1 = 0;
            }
            if (tops[i] != target2 && bottoms[i] != target2) {
                target2 = 0;
                ans2 = 0;
            }
            if (target1 < 1 && target2 < 1) return -1;
        }
        if (Math.min(ans1, ans2) == 0) return Math.max(ans1, ans2);
        else return Math.min(ans1, ans2);
    }
}