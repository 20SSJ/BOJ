arr = [i for i in range(1, 21)]

for _ in range(10):
    a, b = map(int, input().split())
    start = a
    end = b
    for j in range((b - a + 1) // 2):
        arr[a-1+j], arr[b - 1 - j] = arr[b - 1 - j], arr[a - 1 + j]

print(*arr)