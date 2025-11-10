import sys

N = int(sys.stdin.readline())

for i in range(N):
    print(" " * (N - i - 1) + "*" * (2 * i + 1))
for i in range(N - 1):
    print(" " * (i + 1) + "*" * (2 * (N - i - 2) + 1))