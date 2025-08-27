class Solution:
    def findOrder(self, n: int, prerequisites: List[List[int]]) -> List[int]:
        adj = [[] for _ in range(n)]
        indegree = [0] * n
        queue = deque()
        ans = []

        for l in prerequisites:
            adj[l[1]].append(l[0])
            indegree[l[0]] += 1
        
        for i in range(n):
            if indegree[i] == 0:
                queue.append(i)
        
        while queue:
            cur = queue.popleft()
            ans.append(cur)
            for nxt in adj[cur]:
                indegree[nxt] -= 1
                if indegree[nxt] == 0:
                    queue.append(nxt)
        
        if len(ans) == n:
            return ans
        else:
            return []            