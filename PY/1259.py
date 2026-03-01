import sys
input = sys.stdin.readline

flag = True
while(flag):
    bflag = True
    n = str(input().strip())
    if (n == '0'):
        exit()
    size = len(n) // 2
    for i in range(size):
        if (n[i] != n[len(n)-i - 1]):
            bflag = False
            break
    if(bflag):
        print("yes")
    else:
        print("no")