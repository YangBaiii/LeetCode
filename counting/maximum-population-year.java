class Solution {
    public int maximumPopulation(int[][] logs) {
        int ans = 0;
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i-1];
            ans = arr[i] > arr[ans] ? i : ans;
        }
        return ans + 1950;
    }
}