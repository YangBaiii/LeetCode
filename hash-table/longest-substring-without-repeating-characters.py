class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = {}
        ans, start = 0, 0

        for i, ch in enumerate(s):
            if ch in seen and seen[ch] >= start:
                start = seen[ch] + 1
            ans = max(ans, i - start + 1)
            seen[ch] = i

        return ans
