import sys
input = sys.stdin.readline

N = int(input())

arr = [0] * N

for i in range(N):
    a = int(input().strip())
    arr[i] = a

for i in range(N):
    min = arr[i]
    for j in range(i + 1, N):
        if(min > arr[j]):
            arr[i] = arr[j]
            arr[j] = min
            min = arr[i]
for i in arr:
    print(i)