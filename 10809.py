import sys

input = sys.stdin.readline

arr = [-1] * 26
s = list(input().strip())

for a in range(len(arr)):
    f = 0
    for i in range(len(s)):
        if(ord(s[i]) == 97 + a):
            arr[a] = f
            break
        else:
            f += 1
print(*arr)