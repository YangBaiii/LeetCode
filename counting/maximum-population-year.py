class Solution:
    def maximumPopulation(self, logs: List[List[int]]) -> int:
        year = defaultdict(int)
        ans, max_p, cur = 0, 0, 0
        for l in logs:
            year[l[0]] += 1
            year[l[1]] -= 1
        
        for key in sorted(year.keys()):
            cur += year[key]
            if cur > max_p:
                max_p = cur
                ans = key
        
        return ans

