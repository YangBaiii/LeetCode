class Solution:
    def checkValidString(self, s: str) -> bool:
        stack = []
        count = 0

        for i in s:
            if i == '(':
                stack.append(i)
            elif i == '*':
                count += 1
            else:
                if not stack:
                    if count == 0:
                        return False
                    else: count -= 1
                else: stack.pop()

        return count >= len(stack)