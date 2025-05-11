class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0, count1 = 0, count2 = 0;
        for (int i : nums1) {
            count1 += i == 0 ? 1 : 0;
            sum1 += Math.max(1, i);
        }
        for (int i : nums2) {
            count2 += i == 0 ? 1 : 0;
            sum2 += Math.max(1, i);;
        }
        if (count1 == 0 && sum1 < sum2) return -1;
        if (count2 == 0 && sum1 > sum2) return -1;
        return Math.max(sum1, sum2);
    }
}