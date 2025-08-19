class Solution:
    def zeroFilledSubarray(self, nums: List[int]) -> int:
        i, ans = 0, 0
        for num in nums:
            if num == 0:
                i += 1
            else:
                ans += i * (i + 1) // 2
                i = 0

        ans += i * (i + 1) // 2
        return ans