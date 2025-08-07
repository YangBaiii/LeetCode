class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        m, n = len(board), len(board[0])
        self.isUsed = [[False for _ in range(n)] for _ in range(m)]

        def dfs(path, i, j):
            if i < 0 or i >= m or j < 0 or j >= n or self.isUsed[i][j]:
                return False

            path += board[i][j]
            if not word.startswith(path):
                return False
            if path == word:
                return True

            self.isUsed[i][j] = True
            res = (
                dfs(path, i - 1, j) or
                dfs(path, i + 1, j) or
                dfs(path, i, j + 1) or
                dfs(path, i, j - 1)
            )
            self.isUsed[i][j] = False
            return res
        
        for i in range(m):
            for j in range(n):
                if dfs('', i, j):
                    return True
        
        return False