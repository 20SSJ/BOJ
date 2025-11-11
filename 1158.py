N, K = map(int, input().split())
lst = [i for i in range(1, N + 1)]
result = []
cnt = 0

while lst:
    cnt = (cnt + K - 1) % len(lst)
    result.append(lst.pop(cnt))

print(f"<{', '.join(map(str, result))}>")