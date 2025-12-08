import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
Dem = 0
for i in nums:
    if i < 2:
        continue
    bflag = True
    for j in range(2, i):
        if(i % j == 0):
            bflag = False
    if(bflag):
        Dem += 1
print(Dem)