import sys

N = int(sys.stdin.readline())

for i in range(N):
    print((" ") * i + ("*") * (2 * (N - i - 1) + 1) )
for i in range(N - 1):
    print((" ") * (N - i - 2) + ("*") * (2 * (i + 1) + 1))