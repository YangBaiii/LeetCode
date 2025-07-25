class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        mapping = {}

        if len(words) != len(pattern):
            return False
        
        for dx, dy in zip(pattern, words):
            if dx in mapping:
                if mapping[dx] != dy:
                    return False
            elif dy in mapping.values():
                return False
            
            mapping[dx] = dy

        return True