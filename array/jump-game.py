class Solution:
    def canJump(self, nums: List[int]) -> bool:
        dis = 1

        for i in range(len(nums)):
            if i > dis:
                return False
            dis = max(dis, i + nums[i])
            if dis >= len(nums):
                return True
        
        return dis >= len(nums)