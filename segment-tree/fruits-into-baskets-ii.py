class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        used, n = 0, len(fruits)
        
        for i in range(n):
            for j in range(n):
                if fruits[i] <= baskets[j]:
                    used += 1
                    baskets[j] = 0
                    break
        
        return n - used