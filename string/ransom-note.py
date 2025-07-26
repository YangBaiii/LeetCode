class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        if len(ransomNote) > len(magazine):
            return False

        count_map = defaultdict(int)
        for i in magazine:
            count_map[i] += 1

        for j in ransomNote:
            if j not in count_map or count_map[j] <= 0:
                return False
            count_map[j] -= 1
        
        return True