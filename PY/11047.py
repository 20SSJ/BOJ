import sys
input = sys.stdin.readline

N, K = map(int, input().split())
arr = []
for _ in range(N):
    i = int(input().strip())
    arr.append(i)
total = 0
for j in range(N-1, -1, -1):
    if K >= arr[j]:
        d = K // arr[j]
        K %= arr[j]
        total += d
print(total)