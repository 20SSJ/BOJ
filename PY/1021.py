import sys
from collections import deque

a, b = map(int, sys.stdin.readline().split())
d = deque(range(1, a+1))
numbers= deque(map(int, sys.stdin.readline().split()))
cnt = 0

while(len(numbers)):
    if (d[0] == numbers[0]):
        d.popleft()
        numbers.popleft()
    else:
        if(d.index(numbers[0]) <= len(d)//2):
            while(d[0] != numbers[0]):
                d.append(d.popleft())
                cnt += 1
        else:
            while(d[0] != numbers[0]):
                d.appendleft(d.pop())
                cnt += 1

print(cnt)   