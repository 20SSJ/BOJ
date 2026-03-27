import sys
input = sys.stdin.readline

N = int(input().strip())
for i in range(N):
    bflag = False
    arr = []
    v = str(input().strip())
    for i in v:
        if i == "(":
            arr.append(i)
        elif i ==")":
            if not arr:
                bflag = True
                break
            else:
                arr.pop()
    if arr or bflag:
        print("NO")
    else:
        print("YES")