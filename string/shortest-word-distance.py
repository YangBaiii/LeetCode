class Solution:
    def shortestDistance(self, wordsDict: List[str], word1: str, word2: str) -> int:
        o1, o2, ans = 30001, 30001, 30001

        for i in range(len(wordsDict)):
            s = wordsDict[i]
            if s != word1 and s != word2:
                continue
            elif s == word1:
                o1 = i 
                ans = min(ans, abs(o1-o2))
            else:
                o2 = i
                ans = min(ans, abs(o1-o2))
        
        return ans