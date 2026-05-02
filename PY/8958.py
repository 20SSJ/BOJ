import sys

input = sys.stdin.readline

N = int(input())
for i in range(N):
    a = list(input())
    sum = 0
    sumScore = 0
    for j in a:
        if j == 'O':
            sum += 1
        else:
            sum = 0
        sumScore += sum
    print(sumScore)