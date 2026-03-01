import sys
input = sys.stdin.readline

n, m = map(int, input().split())

money = n // m
spare = n % m

print(money)
print(spare)