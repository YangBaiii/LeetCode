class Solution:
    def findMissingRanges(self, nums: List[int], lower: int, upper: int) -> List[List[int]]:
        ans = []
        
        for num in nums:
            if num > lower:
                ans.append([lower, num - 1])
            lower = num + 1

        if lower <= upper:
            ans.append([lower, upper])
        
        return ans
