import sys
from collections import deque
input = sys.stdin.readline

def bfs(start):
    queue = deque([start])
    visited = [False] * (N + 1)
    visited[start] = True

    cnt = 0
    while queue:
        now = queue.popleft()
        cnt += 1
        for next_node in graph[now]:
            if not visited[next_node]:
                visited[next_node] = True
                queue.append(next_node)
    print(cnt-1)

N = int(input())
M = int(input())

graph = [[] for _ in range(N + 1)]
for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

bfs(1)