N = input().strip()

arr = [0] * 10
cnt = 0
for i in N:
    if (i != '9' and i != '6'):
        arr[ord(i) - ord('0')] += 1
    else:
        cnt += 1

need = (cnt + 1) // 2

print(max(arr) if max(arr) > need else need)