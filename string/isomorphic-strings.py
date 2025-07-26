class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = defaultdict(str)
        reverse_mapping = defaultdict(str)
        for i in range(len(s)):
            if s[i] not in mapping:
                mapping[s[i]] = t[i]
            if mapping[s[i]] != t[i]:
                return False

        for i in range(len(t)):
            if t[i] not in reverse_mapping:
                reverse_mapping[t[i]] = s[i]
            if reverse_mapping[t[i]] != s[i]:
                return False
                
        return True