import sys

str1 = list(input())
M = int(sys.stdin.readline())
right = []

for _ in range(M):
    cmd = sys.stdin.readline().split()
    if (cmd[0] == "L"):
        if str1:
            right.append(str1.pop())
    elif (cmd[0] == "D"):
        if right:
            str1.append(right.pop())
    elif (cmd[0] == "B"):
        if str1:
            str1.pop()
    elif (cmd[0] == "P"):
        str1.append(cmd[1])
right.reverse()
print(''.join(str1 + right))