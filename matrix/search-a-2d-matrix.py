class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row = 0

        while row < len(matrix):
            left, right = 0, len(matrix[0]) - 1
            if matrix[row][right] < target:
                row += 1
                continue

            while left <= right:
                mid = left + (right - left) // 2
                if matrix[row][mid] > target:
                    right = mid - 1 
                elif matrix[row][mid] < target:
                    left = mid + 1
                else:
                    return True
            break 
            
        return False