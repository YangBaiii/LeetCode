class Solution:
    def minMeetingRooms(self, intervals: List[List[int]]) -> int:
        line = defaultdict(int)
        ans, cur = 0, 0
        for interval in intervals:
            line[interval[0]] += 1
            line[interval[1]] -= 1
        
        for k in sorted(line.keys()):
            cur += line[k]
            ans = max(cur, ans)

        return ans