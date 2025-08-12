class Solution:
    def validPalindrome(self, s: str) -> bool:
        l, r, isDeleted = 0, len(s) - 1, False

        while l < r:
            if s[l] == s[r]:
                l += 1
                r -= 1
            else:
                if isDeleted:
                    return False
                else:
                    isDeleted = True
                    if s[l+1] == s[r]:
                        l += 2
                        r -= 1
                    elif s[l] == s[r-1]:
                        r -= 2
                        l += 1
                    else: return False
        
        return True