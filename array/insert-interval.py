class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])

        start, l, r = newInterval[0], 0, len(intervals) - 1  

        while l <= r:
            mid = l + (r - l) // 2
            if intervals[mid][0] < start:
                l = mid + 1
            elif intervals[mid][0] > start:
                r = mid - 1
            else:  
                l = mid
                break
        index = l
        if index > 0:
            start = min(start, intervals[index - 1][0]) if newInterval[0] <= intervals[index - 1][1] else start
            index -= 1 if newInterval[0] <= intervals[index][1] else 0

        end = newInterval[1]
        while index < len(intervals) and intervals[index][0] <= end:
            end = max(end, intervals[index][1])
            intervals.pop(index)

        intervals.insert(index, [start, end])
        return intervals
