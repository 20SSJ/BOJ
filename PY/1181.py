import sys
input = sys.stdin.readline

N = int(input().strip())
s = set()
for i in range(N):
    w = str(input().strip())
    s.add(w)

a = list(s)
a.sort()
a.sort(key=len)
for i in a:
    print(i)