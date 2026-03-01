import sys
input = sys.stdin.readline

T = int(input())

for test_case in range(1, T+1):
    a, b = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    mx = 0
    if(a < b):
        for i in range(b - a + 1):
            ans = 0
            for j in range(a):
                ans += A[j] * B[j+i]
            if(ans > mx):
                mx = ans
        print(f"#{test_case} {mx}")
    else:
        for i in range(a - b + 1):
            ans = 0
            for j in range(b):
                ans += B[j] * A[j+i]
            if(ans > mx):
                mx = ans
        print(f"#{test_case} {mx}")