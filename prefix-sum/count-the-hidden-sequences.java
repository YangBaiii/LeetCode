class Solution {
    public int numberOfArrays(int[] arr, int lower, int upper) {
    int min = 0, max = 0, cur = 0;
    for (int i = 0; i < arr.length; i++) {
        cur += arr[i];
        if (cur > max) max = cur;
        if (cur < min) min = cur;
    }
    long minStart = (long)lower - min;
    long maxStart = (long)upper - max;
    return maxStart >= minStart ? (int)(maxStart - minStart + 1) : 0;
  }
//   x + min >= lower
//   x + max <= upper
}