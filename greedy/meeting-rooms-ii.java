class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int ans = 0;
        int[] arr = new int[1000001];
        for (int i = 0; i < intervals.length; i++) {
            arr[intervals[i][0]]++;
            arr[intervals[i][1]]--;
        }
        for (int j = 1; j < 1000001; j++) {
            arr[j] += arr[j-1];
            ans = Math.max(arr[j], ans);
        }
        return ans;
    }
}