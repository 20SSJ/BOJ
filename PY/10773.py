import sys

K = int(input().strip())

result = []
for _ in range(K):
    n = int(sys.stdin.readline().strip())
    if (n == 0):
        result.pop()
    else:
        result.append(n)
print(sum(result))
