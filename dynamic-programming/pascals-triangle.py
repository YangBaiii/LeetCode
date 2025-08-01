class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans = []

        for i in range(numRows):
            new = []
            for j in range(i+1):
                if j == 0 or j == i:
                    new.append(1)
                else:
                    new.append(ans[i-1][j-1] + ans[i-1][j])
            ans.append(new)
        
        return ans