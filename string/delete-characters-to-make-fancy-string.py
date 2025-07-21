class Solution:
    def makeFancyString(self, s: str) -> str:
        ans, last, count = '', '', 0

        for i in s:
            if i == last:
                if count == 2:
                    continue
                count += 1
            else: 
                last = i
                count = 1
            ans += i
        
        return ans