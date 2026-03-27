import sys
input = sys.stdin.readline

N = int(input())
cnt = str(input())

sumNum = 0
for i in range(N):
    sumNum += int(cnt[i])
print(sumNum) 