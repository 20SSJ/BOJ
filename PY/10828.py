import sys
N = int(sys.stdin.readline())
result = []
for i in range(N):
    cmd = sys.stdin.readline().split()
    if (cmd[0] == "push"):
        result.append(cmd[1])
    if (cmd[0] == "top"):
        if result:
            print(result[len(result)-1])
        else:
            print(-1)
    if (cmd[0] == "empty"):
        if result:
            print(0)
        else:
            print(1)
    if (cmd[0] == "size"):
        print(len(result))
    if (cmd[0] == "pop"):
        if result:
            print(result.pop())
        else:
            print(-1)