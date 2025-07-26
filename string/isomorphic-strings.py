class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = defaultdict(str)
        for i in range(len(s)):
            if s[i] not in mapping:
                mapping[s[i]] = t[i]
            if mapping[s[i]] != t[i]:
                return False
        return True