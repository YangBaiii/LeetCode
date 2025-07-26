class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = {}
        for ds, dt in zip(s, t):
            if ds in mapping:
                if mapping[ds] != dt:
                    return False
            elif dt in mapping.values():
                return False

            mapping[ds] = dt

        return True