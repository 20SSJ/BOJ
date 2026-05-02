import sys
from collections import deque

input = sys.stdin.readline

n, m = map(int, input().split())

maze = []
for _ in range(n):
    maze.append(list(map(int, input().strip())))

dist = [[-1] *m for _ in range(n)]

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

Q = deque()
Q.append((0, 0))
dist[0][0] = 0
while Q:
    x, y = Q.popleft()
    for dir in range(4):
        nx = x + dx[dir]
        ny = y + dy[dir]

        if nx < 0 or nx >= n or ny < 0 or ny >= m:
            continue

        if dist[nx][ny] != -1 or maze[nx][ny] != 1:
            continue

        dist[nx][ny] = dist[x][y]+1
        
        Q.append((nx, ny))

print(dist[n-1][m-1] + 1)
