class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack = []
        ans = 0

        for j in range(len(s)):
            i = s[j]
            if i == '(':
                stack.append(j)
            else:
                if not stack:
                    stack.append(j)
                else:
                    if s[stack[-1]] == '(':
                        stack.pop()
                    else:
                        stack.append(j)

        if not stack: 
            return len(s)
        
        l, r = 0, len(s)

        while stack:
            l = stack[-1]
            stack.pop()
            ans = max(ans, r-l-1)
            r = l
        ans = max(ans, r)
        return ans
        
        return ans