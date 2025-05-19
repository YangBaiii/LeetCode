class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid < num / mid) {
                left = mid + 1;
            } else if (mid > num / mid) {
                right = mid - 1;
            } else return mid * mid == num;;
            // mid == num / mid
            // mid * mid <= num <= bound
            // So no overflow prevention needed
        }
        return false;
    }
}