import sys
input = sys.stdin.readline

T = int(input())

for test_case in range(1, T+1):
    a = int(input())
    freq = [0]*101 
    numbers = list(map(int, input().split()))
    for num in numbers:
        freq[num] += 1
    mx = max(freq)
    for i in range(100, -1, -1):
        if freq[i] == mx:
            dex = i
            break
    print(f"#{a} {dex}")