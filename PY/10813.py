import sys
input = sys.stdin.readline

N, M = map(int, input().split())

arr = [i + 1 for i in range(N)]

for i in range(M):
    a, b = map(int, input().split())
    tmp = arr[a-1]
    arr[a-1] = arr[b-1]
    arr[b-1] = tmp

print(*arr)