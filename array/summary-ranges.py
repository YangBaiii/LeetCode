class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        ans = []
        
        if not nums:
            return ans

        start = end = nums[0]
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1] + 1:
                end = nums[i]
            else:
                if start == end:
                    ans.append(f"{start}")
                else:
                    ans.append(f"{start}->{end}")
                start = end = nums[i]
        
        # For cases like[1,2,5,6,7]
        if start == end:
            ans.append(f"{start}")
        else:
            ans.append(f"{start}->{end}")
            
        return ans