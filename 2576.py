numbers = []
for _ in range(7):
    num = int(input())
    numbers.append(num)
odd_numbers = []
sum = 0
for i in numbers:
    if(i % 2 != 0):
        sum += i
        odd_numbers.append(i)
if (sum == 0):
    print(-1)
else:
    print(sum)
    print(min(odd_numbers))