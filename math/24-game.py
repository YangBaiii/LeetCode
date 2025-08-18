class Solution:
    def judgePoint24(self, cards: List[int]) -> bool:
        def backtrack(nums):
            if len(nums) == 1:
                return nums[0] == 24
            
            n = len(nums)
            for i in range(n):
                for j in range(i + 1, n):
                    a, b = nums[i], nums[j]
                    next_nums = [nums[k] for k in range(n) if k != i and k != j]
                    results = [a + b, a - b, b - a, a * b]
                    if a != 0:
                      results.append(b / a)
                    if b != 0:
                      results.append(a / b)
                    
                    for res in results:
                      if backtrack([res] + next_nums):
                        return True
            return False
        
        return backtrack(cards)
