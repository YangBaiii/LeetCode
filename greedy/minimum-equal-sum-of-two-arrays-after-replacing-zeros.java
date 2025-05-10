class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, min = Math.min(len1, len2);
        long count1 = 0, count2 = 0, diff = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < Math.max(len1, len2); i++) {
            if (i < min) {
                if (nums1[i] == 0) count1++;
                if (nums2[i] == 0) count2++;
                sum1 += nums1[i];
                sum2 += nums2[i];
                diff += nums1[i] - nums2[i];
            } else {
                if (i < len1) {
                    if (nums1[i] == 0) count1++;
                    sum1 += nums1[i];
                    diff += nums1[i];
                } else {
                    if (nums2[i] == 0) count2++;
                    sum2 += nums2[i];
                    diff -= nums2[i];
                }
            }
        }
        if (sum1 > sum2) {
            if (count2 == 0 || (count1 == 0 && diff < count2)) return -1;
        } else {
            if (count1 == 0 || (count2 == 0 && Math.abs(diff) < count1)) return -1;
        }
        return (long)(Math.max(sum1 + count1, sum2 + count2));
    }
}