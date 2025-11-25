import sys
input = sys.stdin.readline

arr = []
for i in range(10):
    a = int(input())
    result = a % 42
    if result not in arr:
        arr.append(result)
print(len(arr))