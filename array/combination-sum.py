class Solution:
    def combinationSum(self, candidates, target):
        ans, path = [], []
        n = len(candidates)

        def backtrack(start, ssum):
            if ssum == target:
                ans.append(path[:])
                return
            if ssum > target:
                return
            
            for i in range(start, n):
                path.append(candidates[i])
                ssum += candidates[i]
                backtrack(i, ssum)
                path.pop()
                ssum -= candidates[i]
        
        backtrack(0, 0)
        return ans