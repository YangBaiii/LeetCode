class Solution {
    // The score of the subarray in the window is sum * (i - j + 1). 
    // We move the left side of the window, decreasing sum, 
    // if that score is equal or greater than k.
    public long countSubarrays(int[] nums, long k) {
    long sum = 0, res = 0;
    for (int left = 0, right = 0; right < nums.length; right++) {
        sum += nums[right];
        while (sum * (right - left + 1) >= k)
            sum -= nums[left++];
        res += right - left + 1;
    }
    return res;
 }
}