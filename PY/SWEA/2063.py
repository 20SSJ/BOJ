import sys
input = sys.stdin.readline

T = int(input().strip())

arr = list(map(int, input().split()))
arr.sort()

mid = int(T/2)
print(arr[mid])