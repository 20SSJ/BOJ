import sys
from collections import deque

input = sys.stdin.readline

N, M, V = map(int, input().split())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1, N + 1):
    graph[i].sort()

visited = [False] * (N + 1)
def dfs(node):
    visited[node] = True
    print(node, end = " ")
    for next_node in graph[node]:
        if not visited[next_node]:
            dfs(next_node)

def bfs(start):
    queue = deque([start])
    visited = [False] * (N + 1)
    visited[start] = True

    while queue:
        now = queue.popleft()
        print(now, end = " ")
        for next_node in graph[now]:
            if not visited[next_node]:
                visited[next_node] = True
                queue.append(next_node)
dfs(V)
print()
bfs(V)