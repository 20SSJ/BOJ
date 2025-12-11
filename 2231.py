import sys
input = sys.stdin.readline

N = int(input())

bflag = True
for i in range(N):
    digit_sum = i + sum(map(int, str(i)))
    if digit_sum == N:
        bflag = False
        print(i)
        break
if(bflag):
    print(0)
