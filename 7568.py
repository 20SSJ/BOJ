import sys
input = sys.stdin.readline

arr = []
N = int(input().strip())
for _ in range(N):
    x , y = map(int, input().split())
    arr.append([x, y])

for i in arr:
    rank = 1
    for j in arr:
        if i[0] < j[0] and i[1] < j[1]:
            rank += 1
    print(rank, end = " ")