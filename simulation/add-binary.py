class Solution:
    def addBinary(self, a: str, b: str) -> str:
        ans = ''
        n, k, carry = len(a)-1, len(b)-1, 0

        while n >= 0 or k >= 0 or carry > 0:
            new = carry
            if n >= 0:
                new += int(a[n])
                n -= 1
            if k >= 0:
                new += int(b[k])
                k -= 1
            if new > 1:
                new -= 2
                carry = 1
            else:
                carry = 0
            ans += str(new)
        
        return ans[::-1]
