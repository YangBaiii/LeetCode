class Solution:
    def findSubsequences(self, nums: List[int]) -> List[List[int]]:
        ans = []
        sub = []
        def backtrack(start):
            if len(sub) > 1:
                ans.append(sub[:])
            uset = set()
            for i in range(start, len(nums)):
                if sub and nums[i] < sub[-1] or nums[i] in uset:
                    continue
                sub.append(nums[i])
                uset.add(nums[i])
                backtrack(i + 1)
                sub.pop()
        
        backtrack(0)
        return ans
