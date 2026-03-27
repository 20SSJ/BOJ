import sys
input = sys.stdin.readline

N = int(input())
numbers = list(map(int, input().split()))
mx = max(numbers)
sum = 0
for i in numbers:
    sum += i / mx * 100
answer = sum / N
print(answer)