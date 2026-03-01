import sys
input = sys.stdin.readline

n, m = map(int,input().split())
arr = [i + 1 for i in range(n)]
for i in range(m):
    a, b = map(int,input().split())
    arr[a-1:b] = arr[a-1:b][::-1]
print(*arr)