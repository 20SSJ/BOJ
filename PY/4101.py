import sys
input = sys.stdin.readline

bflag = True
while(bflag):
    a, b = map(int, input().split())
    if (a == 0 and b == 0):
        bflag = False
        break
    else:
        if(a > b):
            print("Yes")
        else:
            print("No")