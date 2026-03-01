numbers = []
sum = 0
for i in range(9):
    num = int(input())
    numbers.append(num)
    sum += num
a = sum - 100

for i in range(len(numbers)):
    for k in range(i + 1, len(numbers)):
        if(numbers[i] + numbers[k] == a):
            b = numbers[i]
            c = numbers[k]
            break

numbers.remove(b)
numbers.remove(c)
numbers.sort()

for num in numbers:
    print(num)