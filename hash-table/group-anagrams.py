class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = []
        count_map = {}

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            key = tuple(count)  
            count_map.setdefault(key, []).append(s)
        
        for anagrams in count_map.values():
            group.append(anagrams)
        
        return group