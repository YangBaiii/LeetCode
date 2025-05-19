class Solution {
    public String triangleType(int[] nums) {
        if (nums[1] == nums[0]) {
            if (nums[1] == nums[2]) return "equilateral";
            return canFormTriangle(nums[0], nums[1], nums[2]) ? "isosceles" : "none";
        } else if (nums[2] == nums[1] || nums[2] == nums[0]) {
            return canFormTriangle(nums[0], nums[1], nums[2]) ? "isosceles" : "none";
        } else return canFormTriangle(nums[0], nums[1], nums[2]) ? "scalene" : "none";
    }

    public boolean canFormTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}