class Solution:
    def mySqrt(self, x: int) -> int:
        l, r = 0, pow(2, 16)

        while l <= r:
            mid = l + (r - l) // 2
            temp = mid * mid - x
            if temp > 0:
                r = mid - 1
            elif temp < 0:
                l = mid + 1
            else: return mid
        
        return r