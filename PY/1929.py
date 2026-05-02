import sys
input = sys.stdin.readline

M, N = map(int, input().split())

for i in range(M, N + 1):
    bflag = True
    if i == 1:
        continue
    for j in range(2, int(i**0.5) + 1):
        if i % j == 0:
            bflag = False
            break
    if(bflag):
        print(i)