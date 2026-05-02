import sys
input = sys.stdin.readline

N, K = map(int, input().split())
cnt  = 0

arr = [i for i in range(1, N+1)]
result = []

while(len(arr) != 0):
    cnt = (cnt+K-1) % len(arr)
    result.append(arr.pop(cnt))
print(f"<{', '.join(map(str, result))}>")