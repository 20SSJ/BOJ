import sys
input = sys.stdin.readline

N = int(input().strip())
line = list(map(int, input().split()))
line.sort()
total = 0
for i in range(len(line)):
    total += line[i] * (len(line) - i)
print(total)