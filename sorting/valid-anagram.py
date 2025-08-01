class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_map = defaultdict(int)

        for i in s:
            s_map[i] += 1
        
        for j in t:
            if j not in s_map:
                return False
            s_map[j] -= 1
            if s_map[j] == 0:
                s_map.pop(j)
        
        return len(s_map) == 0