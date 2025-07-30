class Solution:
    def checkValidString(self, s: str) -> bool:
        # Least and max number of ( 
        cmin = cmax = 0

        for i in s:
            if i == '(':
                cmin += 1
                cmax += 1
            elif i == ')':
                cmin -= 1
                cmax -= 1
            else:
                cmin -= 1
                cmax += 1
            if cmax < 0:
                return False
            
            cmin = max(0, cmin)
        
        return cmin == 0