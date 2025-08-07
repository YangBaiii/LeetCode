class Solution:
    def validWordAbbreviation(self, word: str, abbr: str) -> bool:
        index, i, n = 0, 0, len(abbr)
        while i < n:
            if abbr[i].isalpha():
                if index >= len(word) or abbr[i] != word[index]:
                    return False
                index += 1
                i += 1
            else:
                if abbr[i] =='0':
                    return False
                num = 0
                while i < n and abbr[i].isdigit():
                    num = num * 10 + int(abbr[i])
                    i += 1
                index += num

        return index == len(word)