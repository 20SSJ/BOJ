from collections import deque
import sys

d = deque()
n = int(sys.stdin.readline())

for i in range(n):
    cmd = sys.stdin.readline().split()
    if (cmd[0] == "push"):
        d.append(cmd[1])
    elif (cmd[0] == "pop"):
        if len(d):
            print(d.popleft())
        else:
            print(-1)
    elif (cmd[0] == "size"):
        print(len(d))
    elif (cmd[0] == "back"):
        if len(d):
            print(d[len(d)-1])
        else:
            print(-1)
    elif (cmd[0] == "front"):
        if len(d):
            print(d[0])
        else:
            print(-1)
    elif (cmd[0] == "empty"):
        if len(d):
            print(0)
        else:
            print(1)
    