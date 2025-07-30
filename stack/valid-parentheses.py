class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in s:
            if i == '(' or i == '[' or i == '{':
                stack.append(i)
                continue
            elif i == ')':
                if not stack or stack[-1] != '(':
                    return False
            elif i == ']':
                if not stack or stack[-1] != '[':
                    return False
            elif i == '}':
                if not stack or stack[-1] != '{':
                    return False
            stack.pop()
        
        return not stack
