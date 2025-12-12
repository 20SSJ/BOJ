import sys
input = sys.stdin.readline

N = int(input())

def fib(N):
    if (N == 0):
        return 0
    elif (N <= 2):
        return 1
    return fib(N-1) + fib(N-2)

print(fib(N))