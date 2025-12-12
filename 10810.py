import sys
input = sys.stdin.readline

N, M = map(int, input().split())

arr = [[] for _ in range(N)]

for i in range(M):
    a, b, c = map(int, input().split())
    for i in range(a - 1, b):
        arr[i].append(c)

for i in range(N):
    print(arr[i][-1] if arr[i] else 0, end = " ")