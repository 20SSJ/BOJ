numbers = list(map(int, input().split()))
a = max(numbers)
b = min(numbers)
if a == b:
    print(0)
else:
    print(a - b - 1)
    for num in range(b + 1, a):
        print(num, end = " ")