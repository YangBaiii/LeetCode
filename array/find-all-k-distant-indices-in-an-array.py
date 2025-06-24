class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        n = len(nums)
        mark = [False] * n
        for i in range(n):
            if nums[i] == key:
                start = max(0, i - k)
                end = min(n - 1, i + k)
                for j in range(start, end + 1):
                    mark[j] = True
        return [i for i, v in enumerate(mark) if v]
