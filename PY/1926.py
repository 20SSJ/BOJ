import sys
from collections import deque

input = sys.stdin.readline
n, m = map(int, input().split()) # 행, 열

board = []
for _ in range(n):
    board.append(list(map(int, input().split())))

vis = [[False for _ in range(m)] for _ in range(n)]

dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]

mx = 0  # 그림의 최댓값
num = 0 # 그림의 수

for i in range(n):
    for j in range(m):
        if board[i][j] == 0 or vis[i][j]:
            continue
        num += 1
        Q = deque()
        vis[i][j] = True
        Q.append((i, j))
        area = 0
        while Q:
            area += 1
            cur = Q.popleft()
            for dir in range(4):
                nx = cur[0] + dx[dir]
                ny = cur[1] + dy[dir]

                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue

                if vis[nx][ny] or board[nx][ny] != 1:
                    continue

                vis[nx][ny] = True   
                Q.append((nx, ny))
            
            mx = max(mx, area)

print(num)
print(mx)