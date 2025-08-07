class TrieNode:
    def __init__(self):
        self.children = {}
        self.isEnd = False

class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        node = self.root
        for c in word:
            if c not in node.children:
                node.children[c] = TrieNode()
            node = node.children[c]
        node.isEnd = True

    def search(self, word: str) -> bool:
        return self.dfs(word, 0, self.root, requireEnd=True)

    def startsWith(self, prefix: str) -> bool:
        return self.dfs(prefix, 0, self.root, requireEnd=False)

    def dfs(self, s, i, node, requireEnd):
        if i == len(s):
            return node.isEnd if requireEnd else True

        c = s[i]
        if c in node.children:
            return self.dfs(s, i + 1, node.children[c], requireEnd)
        else:
            return False

            



# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)