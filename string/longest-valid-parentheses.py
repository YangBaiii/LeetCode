class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack = []
        ans = 0

        for i in s:
            if i == '(':
                stack.append(i)
            elif i == ')':
                if not stack or stack[-1] == ')':
                    stack.append(i)
                else:
                    stack.pop()
                    ans += 2
        
        return ans