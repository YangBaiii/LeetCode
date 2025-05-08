class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int ans = 0, left = 50001, right = -50001, count = 0;
        for (int[] arr : intervals) {
           if (arr[0] >= left && arr[1] <= right) {
            ans++;
           }
           left = Math.min(left, arr[0]);
           right = Math.max(right, arr[1]);
        }
        return ans;
    }
}