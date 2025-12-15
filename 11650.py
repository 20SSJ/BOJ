import sys
input = sys.stdin.readline

N = int(input().strip())

arr = []
for i in range(N):
    x, y = map(int, input().split())
    arr.append([x, y])
for i in sorted(arr):
    print(*i)