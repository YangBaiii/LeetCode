class Solution:
    def myPow(self, x: float, n: int) -> float:
        def fastPow(x, n):
            if n == 0:
                return 1
            half = fastPow(x,n//2)
            return half * half if n % 2 == 0 else half * half * x

        return fastPow(x,n) if n >= 0 else 1 / fastPow(x,-n)