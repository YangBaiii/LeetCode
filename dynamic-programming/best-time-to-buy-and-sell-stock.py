class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ans, low = 0, 10001
        for i in prices:
            ans = max(i - low, ans)
            low = min(low, i)
        return ans