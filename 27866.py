import sys
input = sys.stdin.readline

w = str(input())
i = int(input())

for j in range(len(w)):
    if j == i - 1:
        print(w[j])
        break