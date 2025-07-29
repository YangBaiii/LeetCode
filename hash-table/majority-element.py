class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        vote = ans = 0
        for n in nums:
            if vote == 0:
                ans = n
            if n == ans:
                vote += 1
            else:
                vote -= 1

        return ans