class Solution:
    def subarrayBitwiseORs(self, arr: List[int]) -> int:
        ans_set = current = set()

        for num in arr:
            new_current = {num}
            for i in current:
                new_current.add(num | i)
            current = new_current
            ans_set.update(current)

        return len(ans_set)
        