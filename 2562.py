numbers = []
for _ in range(9):
    num = int(input())
    numbers.append(num)

M = max(numbers)
print(M)
print(numbers.index(M) + 1)