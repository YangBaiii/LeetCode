class Solution:
    def shortestDistance(self, wordsDict: List[str], word1: str, word2: str) -> int:
        o1, o2, ans = -1, -1, len(wordsDict)

        for i, s in enumerate(wordsDict):
            if s == word1:
                o1 = i
            elif s == word2:
                o2 = i
            if o1 >= 0 and o2 >= 0:
                ans = min(ans, abs(o1 - o2))

        return ans