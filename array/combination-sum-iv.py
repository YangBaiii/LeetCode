class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        self.ans = 0

        def backtrack(ssum):
            if ssum == target:
                self.ans += 1
                return 
            if ssum > target:
                return 
            
            for i in range(len(nums)):
                backtrack(ssum + nums[i])
        
        backtrack(0)
        return self.ans
