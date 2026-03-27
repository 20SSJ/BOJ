import sys
input = sys.stdin.readline

w = input().strip()
size = len(w) // 2

bflag = True
for i in range(size):
    if w[i] != w[len(w) - i - 1]:
        bflag = False
        break
if bflag:
    print(1)
else:
    print(0)