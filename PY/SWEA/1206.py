import sys

input = sys.stdin.readline

T = int(input())
for k in range(1, T+1):
    j = int(input())
    numbers = list(map(int, input().split()))
    result = 0
    for i in range(2, j-2):
        blg = max(numbers[i-1], numbers[i-2], numbers[i+1], numbers[i+2])
        if(numbers[i] <= blg):
            continue
        else:
            result += numbers[i] - blg
    print(f"#{k} {result}")