class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        comb = {'2':'abc', '3':'def', '4':'ghi', '5':'jkl', '6':'mno', '7':'pqrs', '8':'tuv', '9':'wxyz'}
        ans = []

        def backtrack(digits, i, s):
            if i == len(digits):
                ans.append(s)
                return

            for j in comb[digits[i]]:
                backtrack(digits, i+1, s+j)
            
        if digits:
            backtrack(digits, 0, '')
        return ans
            