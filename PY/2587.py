import statistics

numbers = []
sum = 0
for _ in range(5):
    num = int(input())
    numbers.append(num)
    sum += num

numbers.sort()

print(int(sum/len(numbers)))
print(statistics.median(numbers))
