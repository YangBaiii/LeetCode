class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack = []
        ans, cur = 0, 0

        for i in s:
            if i == '(':
                if stack and stack[-1] == '(':
                    cur = 0
                stack.append(i)
            elif i == ')':
                if not stack or stack[-1] == ')':
                    stack.append(i)
                    cur = 0
                else:
                    stack.pop()
                    cur += 2
                    ans = max(cur, ans)
        
        return ans