class Solution {
    public int numberOfArrays(int[] arr, int lower, int upper) {
        int min = 0, max = 0, ans = 0, cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            if(cur > max) max = cur;
            if(cur < min) min = cur;
        }
        return lower + max - min > upper ? 0 : upper - (lower + max - min) + 1;
    }
    // x, x+1, x+4, x+1
    // x, x+3, x-1, x+4, x+5, x+3
    // -1, 5
    // x - 1 = lower
    // lower + min 
    // lower + max - min
}