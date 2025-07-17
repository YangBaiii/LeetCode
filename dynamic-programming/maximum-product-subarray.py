class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        pos, neg = [1] * len(nums), [1] * len(nums)
        ans = pos[0] = neg[0] = nums[0]

        for i in range(1, len(nums)):
            pos[i] = max(pos[i-1] * nums[i], nums[i], neg[i-1] * nums[i])
            neg[i] = min(neg[i-1] * nums[i], nums[i], pos[i-1] * nums[i])
            ans = max(ans, pos[i])

        return ans
        