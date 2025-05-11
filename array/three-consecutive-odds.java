class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int lastEven = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                lastEven = i;
            } else {
                if (i - lastEven >= 3) return true;
            }
        }
        return false;
    }
}