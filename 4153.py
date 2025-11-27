import sys
input = sys.stdin.readline

bflag = True
while(bflag):
    numbers = list(map(int, input().split()))
    numbers.sort()
    a = numbers[0]
    b = numbers[1]
    c = numbers[2]
    if (a == 0 and b == 0 and c == 0):
        bflag = False
        break
    if (a * a + b * b == c * c):
        print("right")
    else:
        print("wrong")