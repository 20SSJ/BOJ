import sys
input = sys.stdin.readline

T = 10

result = []
for _ in range(T):
    a = int(input())
    arr = []
    for _ in range(100):
        row = list(map(int, input().split()))
        arr.append(row)
    mx_row = 0
    for row in arr:
        mx_row = max(mx_row, sum(row))

    sum_col = [0] * 100
    for i in range(100):
        for j in range(100):
            sum_col[i] += arr[j][i]
    mx_col = max(sum_col)

    result_diag = 0
    for i in range(100):
        result_diag += arr[i][i]

    result_back = 0
    for i in range(100):
        result_back += arr[i][99 - i]
    mx = max(mx_row, mx_col, result_diag, result_back)
    print(f"#{a} {mx}")