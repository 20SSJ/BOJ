import sys
input = sys.stdin.readline

answer = [1, 1, 2, 2, 2, 8]

numbers = list(map(int, input().split()))

arr = [0] * 6

for i in range(len(answer)):
    arr[i] = answer[i] - numbers[i]

print(*arr)