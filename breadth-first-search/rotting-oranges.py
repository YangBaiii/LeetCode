class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        row, col = len(grid), len(grid[0])
        q = deque()
        ans = fresh = 0

        for i in range(row):
            for j in range(col):
                if grid[i][j] == 1:
                    fresh += 1
                elif grid[i][j] == 2:
                    q.append((i,j,0))

        if fresh == 0:
            return 0
        if not q:
            return -1
            
        dirs = [[0,1], [0,-1], [-1,0], [1,0]]
        while q:
            x, y, minute = q.popleft()
            ans = max(ans, minute)
            for dx, dy in dirs:
                n1 = dx + x
                n2 = dy + y
                if 0 <= n1 < row and 0 <= n2 < col and grid[n1][n2] == 1:
                    fresh -= 1
                    grid[n1][n2] = 2
                    q.append((n1, n2, minute + 1))
        
        return ans if fresh == 0 else -1
