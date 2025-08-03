class Solution:
    def shortestWordDistance(self, wordsDict: List[str], word1: str, word2: str) -> int:
        i1, i2, min_dis = -1, -1, 100001

        for i, s in enumerate(wordsDict):
            if s == word1:
                if s == word2:
                    if i2 < 0:
                        i2 = i1
                i1 = i
            elif s == word2:
                i2 = i
            if i1 >= 0 and i2 >= 0:
                min_dis = min(min_dis, abs(i1 - i2))
        
        return min_dis
