class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s

        ans = ''
        n, circle = len(s), 2 * numRows - 2

        for i in range(numRows):
            for j in range(i, n, circle):
                ans += s[j]
                if i != 0 and i != numRows - 1 and j + circle - i - i < n:
                    ans += s[j+circle-i-i]
                
        return ans