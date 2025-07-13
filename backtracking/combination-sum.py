class Solution:
    def combinationSum(self, candidates, target):
        self.ans = []
        self.path = []
        self.backtrack(target, 0, 0, candidates)
        return self.ans

    def backtrack(self, target, sum, start, candidates):
        if sum > target:
            return
        if sum == target:
            self.ans.append(self.path[:])  
            return
        
        for i in range(start, len(candidates)):
            self.path.append(candidates[i])
            self.backtrack(target, sum + candidates[i], i, candidates)  
            self.path.pop() 
