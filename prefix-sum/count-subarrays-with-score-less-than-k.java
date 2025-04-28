class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0;
        int len = nums.length;
        long[] prefix = new long[len+1];
        for (int i = 0; i < len; i++) {
            prefix[i+1] = prefix[i] + nums[i];
        }
        for (int i = 0; i < len; i++) {
            int left = i, right = len;
            while (left < right) {
                int mid = left + (right - left) / 2;
                long sum = prefix[mid+1] - prefix[i];
                long score = sum * (mid - i + 1);
                if (score < k) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            ans += left - i;
        }
        return ans;
    }
}