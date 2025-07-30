class Solution:
    def gameOfLife(self, board: List[List[int]]) -> None:
        
        def count(board, i, j):
            live = dead = 0
            for x in range(max(0, i-1), min(len(board), i+2)):
                for y in range(max(0, j-1), min(len(board[0]), j+2)):
                    if (x, y) != (i, j):  
                        if board[x][y] == 1:
                            live += 1
                        else:
                            dead += 1

            return (live, dead)
        
        counts = []
        for i in range(len(board)):
            row = []
            for j in range(len(board[0])):
                live, dead = count(board, i, j)
                row.append((live, dead))
            counts.append(row)

        for i in range(len(board)):
            for j in range(len(board[0])):
                live, _ = counts[i][j]  
                if board[i][j] == 1:
                    if live < 2 or live > 3:
                        board[i][j] = 0
                else:
                    if live == 3:
                        board[i][j] = 1