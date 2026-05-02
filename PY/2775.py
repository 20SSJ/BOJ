import sys
input = sys.stdin.readline

def ppl(f, u):
    if (f == 0):
        return u
    else:
        p = 0
        for i in range(u):
            p += ppl(f-1, i + 1)
        return p
T = int(input().strip())
for _ in range(T):
    f = int(input())
    u = int(input())
    print(ppl(f, u))