import sys
input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split()))
T, P = map(int, input().split())

sum_T = 0
for i in range(6):
    sum_T += (nums[i] - 1) // T + 1
print(sum_T)
a = N // P
b = N % P
print(a, b)