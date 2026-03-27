import sys
input = sys.stdin.readline

N, k = map(int, input().split())

a = 1
for i in range(k):
    a *= N - i

b = 1
for i in range(1, k + 1):
    b *= i

print(a // b)