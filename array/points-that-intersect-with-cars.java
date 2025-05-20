class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] arr = new int[102];
        int ans = 0, count = 0;
        for (int i = 0; i < nums.size(); i++) {
            arr[nums.get(i).get(0)]++;
            arr[nums.get(i).get(1) + 1]--;
        }
        for (int i = 1; i < 102; i++) {
            count += arr[i];
            if (count > 0) {
                ans++;
            }
        }
        return ans;
    }
}