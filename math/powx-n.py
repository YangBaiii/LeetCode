class Solution:
    def myPow(self, x: float, n: int) -> float:
        ans, temp = 1, n
        while abs(temp) > 0:
                ans *= x 
                temp = temp - 1 if n > 0 else temp + 1

        return ans if n > 0 else 1 / ans