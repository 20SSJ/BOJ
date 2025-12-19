import sys
n = int(sys.stdin.readline())

numbers = list(map(int, sys.stdin.readline().split()))

need = int(input())
cnt = 0

arr = []
for i in range(len(numbers)):
    arr.append(need - numbers[i])

for i in arr:
    if i in numbers:
        cnt+=1
print(cnt//2)