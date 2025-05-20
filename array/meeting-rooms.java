class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        int[] arr = new int[1000001];
        for (int i = 0; i < intervals.length; i++) {
            arr[intervals[i][0]]++;
            arr[intervals[i][1]]--;
        }
        for (int j = 1; j < 10001; j++) {
            arr[j] += arr[j-1];
            if (arr[j] > 1) return false;
        }
        return true;
    }
}