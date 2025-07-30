class Solution:
    def canReach(self, arr: List[int], start: int) -> bool:
        visited = set()
        def jump(arr, i):
            if i < 0 or i >= len(arr) or i in visited:
                return False
            if arr[i] == 0:
                return True
            
            visited.add(i)

            return jump(arr,i + arr[i]) or jump(arr,i - arr[i])

        return jump(arr, start)