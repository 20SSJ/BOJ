N = int(input())

for i in range(N):
    bflag = True
    a, b = map(str, input().split())
    if (len(a) != len(b)):
        bflag = False
    elif (sorted(a) != sorted(b)):
        bflag = False
    if(bflag):
        print("Possible")
    else:
        print("Impossible")