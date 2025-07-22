class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        ans, count, l, r = 0, 0, 0, 0
        v_count = defaultdict(int)

        for r in range(len(nums)):
            if nums[r] not in v_count:
                count += nums[r]
                v_count[nums[r]] += 1
                ans = max(ans, count)
            else:
                while nums[l] != nums[r]:
                    v_count[nums[l]] -= 1
                    count -= nums[l]
                    l += 1

        return ans