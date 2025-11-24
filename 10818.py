import sys
input = sys.stdin.readline

n = int(input())
numbers = list(map(int, input().split()))
mn = min(numbers)
mx = max(numbers)
print(mn , mx)