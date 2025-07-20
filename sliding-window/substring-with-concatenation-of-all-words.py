class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        ans = []
        perm = permutations(words)
        for p in perm:
            c = ''.join(p[:])
            if s.find(c) >= 0 and s.find(c) not in ans:
                ans.append(s.find(c))
        
        return ans