class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l, ans, s = 0, 100001, 0

        for r in range(len(nums)):
            s += nums[r]

            while (s >= target):
                s -= nums[l]
                ans = min(ans, r - l + 1)
                l += 1

        return 0 if ans == 100001 else ans