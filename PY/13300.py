a, K = map(int, input().split())

arr = [[0] * 6 for _ in range(2)]

for _ in range(a):
    S, Y = map(int, input().split())
    arr[S][Y - 1] += 1

room = 0
for i in range(2):
    for j in range(6):
        if (arr[i][j] > 0):
            room += (arr[i][j] + K - 1) // K
print(room)