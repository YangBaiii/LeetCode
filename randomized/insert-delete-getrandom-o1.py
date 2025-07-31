class RandomizedSet:

    def __init__(self):
        self.rSet = {}  
        self.val_list = []

    def insert(self, val: int) -> bool:
        if val not in self.rSet:
            self.val_list.append(val)
            self.rSet[val] = len(self.val_list) - 1
            return True
        return False

    # List general deletion is O(n)
    def remove(self, val: int) -> bool:
        if val in self.rSet:
            index = self.rSet[val]
            last_val = self.val_list[-1]

            self.val_list[index] = last_val
            self.rSet[last_val] = index
            
            self.val_list.pop()
            del self.rSet[val]
            
            return True
        return False

    def getRandom(self) -> int:
        return random.choice(self.val_list)
        


# Your RandomizedSet object will be instantiated and called as such:
# obj = RandomizedSet()
# param_1 = obj.insert(val)
# param_2 = obj.remove(val)
# param_3 = obj.getRandom()