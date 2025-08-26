class Solution:
    def areaOfMaxDiagonal(self, dimensions: List[List[int]]) -> int:
        ans, cur, area = 0, 0, 0

        for l in dimensions:
            dig = pow(l[0], 2) + pow(l[1], 2)
            if dig > cur:
                area = l[0] * l[1]
                cur = dig
                ans = area
            elif dig == cur:
                area = max(area, l[0] * l[1])
        
        return ans