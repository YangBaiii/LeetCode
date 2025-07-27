class Solution:
    def countHillValley(self, nums: List[int]) -> int:
        ans = 0
        for i in range(1, len(nums)-1):
            l = i - 1
            while nums[i] == nums[i+1]:
                i += 1
            r = i + 1
            
            if (nums[i] > nums[l] and nums[i] > nums[r]) or (nums[i] < nums[l] and nums[i] < nums[r]):
                ans += 1

        return ans