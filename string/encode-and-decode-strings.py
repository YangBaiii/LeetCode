class Codec:
    def encode(self, strs: List[str]) -> str:
        """Encodes a list of strings to a single string.
        """
        return ''.join(str(len(s)) + ':' + s for s in strs)
        

    def decode(self, s: str) -> List[str]:
        """Decodes a single string to a list of strings.
        """
        ans = []
        i = 0
        
        while i < len(s):
            j = s.find(':', i)
            length = int(s[i:j])
            i = j + 1 + length
            ans.append(s[j+1:i])

        return ans

# Your Codec object will be instantiated and called as such:
# codec = Codec()
# codec.decode(codec.encode(strs))