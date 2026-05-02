import sys
input = sys.stdin.readline

arr = [-1] * 26
s = input().strip()

for a in range(len(arr)):
    for i in range(len(s)):
        if(ord(s[i]) == 97 + a):
            arr[a] = i
            break
print(*arr)