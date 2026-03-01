import sys
input = sys.stdin.readline

N = int(input().strip())
nums = set(map(int, input().split()))
M = int(input().strip())
num2 = list(map(int, input().split()))
for i in range(M):
    if num2[i] in nums:
        print(1)
    else:
        print(0)