class DetectSquares:
    def __init__(self):
        self.cnt = defaultdict(int)

    def add(self, point: list[int]) -> None:
        self.cnt[tuple(point)] += 1

    def count(self, point: list[int]) -> int:
        x, y = point
        ans = 0
        for (x2, y2), freq in self.cnt.items():
            if abs(x - x2) != abs(y - y2) or x == x2 or y == y2:
                continue
            ans += freq * self.cnt[(x, y2)] * self.cnt[(x2, y)]
        return ans

# Your DetectSquares object will be instantiated and called as such:
# obj = DetectSquares()
# obj.add(point)
# param_2 = obj.count(point)