import sys
input = sys.stdin.readline

arr = []
N = int(input())
for i in range(N):
    x, y = map(int, input().split())
    arr.append([y,x])

result = sorted(arr)

for y,x in result:
    print(x,y)