import sys
input = sys.stdin.readline

N = int(input())

fac = 1
for i in range(1, N + 1):
    fac *= i

result = str(fac)
sum = 0
bflag = False
for i in reversed(result):
    if i == '0':
        sum += 1
        bflag = True
    if bflag and i != '0':
        break
print(sum)