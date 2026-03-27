import sys

N = int(sys.stdin.readline())

for i in range(N):
    print(("*") * (i + 1) + (" ")*(N - i - 1) * 2 + ("*") * (i + 1))
for i in range(N):
    print(("*") * (N - 1 - i) + (" ") * (i + 1) * 2 + ("*") * (N - 1 - i))