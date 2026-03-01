import sys
from collections import deque

input = sys.stdin.readline

T = int(input())
for test_case in range(1, T + 1):
    N = int(input())
    arr = []
    for i in range(N):
        arr[i] = str(input())
    print(f"{test_case}")

def bfs(node):
    queue = deque([node])
    visited = [False] * (N + 1)
    visited[node] = True

    while queue:
        now = queue.popleft()
        print(now, end = " ")
