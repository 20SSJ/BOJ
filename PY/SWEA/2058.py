import sys

input = sys.stdin.readline

n = str(input().strip())

ans = 0
for i in n:
    ans += int(i)

print(ans)