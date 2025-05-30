class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length, ans = 0;
        int[] arr = new int[len];
        Arrays.fill(arr, 1);
        for (int i = 1; i < len; i++) {
            if (ratings[i] > ratings[i-1]) {
                arr[i] = arr[i-1] + 1;
            }
        }
        for (int i = len - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                arr[i] = Math.max(arr[i], arr[i+1] + 1);
            }
        }
        for (int i : arr) ans += i;
        return ans;
    }
}
