import sys
input = sys.stdin.readline

N = int(input().strip())

answer = 0
i = '666'
while(True):
    i = str(i)
    if '666' in i:
        answer += 1
    if (N == answer):
        print(i)
        break
    i = int(i) + 1