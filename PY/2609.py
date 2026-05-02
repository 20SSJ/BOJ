import sys
input = sys.stdin.readline

a, b = map(int, input().split())

mx = max(a, b)
mn = min(a, b)

d = []
for i in range(1, mn + 1):
    if (mx % i ==0 and mn % i == 0):
        d.append(i)
di = max(d)
print(di)

m = (mx // di) * (mn // di) * di
print(m)