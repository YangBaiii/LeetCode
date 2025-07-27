class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        nums = [nums[0]] + [nums[i] for i in range(1, len(nums)) if nums[i] != nums[i-1]]

        ans = 0
        for i in range(1, len(nums) - 1):
            if ((nums[i] > nums[i-1] and nums[i] > nums[i+1]) 
            or (nums[i] < nums[i-1] and nums[i] < nums[i+1])):
                ans += 1
                
        return ans
