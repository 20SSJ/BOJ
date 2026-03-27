import sys
input = sys.stdin.readline

result = 5000
N = int(input())
for i in range(N):
    for j in range(N):
        if N == 3 * i + 5 * j:
            if (result > i + j):
                result = i + j
if (result == 5000):
    print(-1)
else:
    print(result)