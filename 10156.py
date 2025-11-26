import sys
input = sys.stdin.readline

a, b, c = map(int, input().split())

price = a * b
money = price - c

if money > 0:
    print(money)
else:
    print(0)