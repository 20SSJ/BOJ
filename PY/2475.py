import sys
input = sys.stdin.readline

numbers = list(map(int, input().split()))

sum = 0
for i in range(len(numbers)):
    sum += numbers[i] * numbers[i]
result = sum % 10
print(result)