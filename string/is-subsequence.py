class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        l, r = 0, 0
        if len(s) > len(t) and len(t) == 0:
            return False
        if len(s) == 0:
            return True
            
        while r < len(t):
            if t[r] == s[l]:
                l += 1
                if l == len(s):
                    return True
            r += 1
        
        return False