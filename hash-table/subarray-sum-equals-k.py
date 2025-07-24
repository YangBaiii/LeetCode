class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        ans = 0
        prefix = list(accumulate(nums))

        for i in range(len(nums)):
            if prefix[i] == k:
                ans += 1
            else:
                for j in range(i):
                    if prefix[i] - prefix[j] == k:
                        ans += 1
                        break
        return ans