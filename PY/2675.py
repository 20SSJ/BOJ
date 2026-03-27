import sys
input = sys.stdin.readline

i = int(input())
for _ in range(i):
    a, b = input().split()
    for j in b:
        print(int(a) * j, end="")
    print()