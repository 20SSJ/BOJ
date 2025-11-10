import sys

numbers = []
for i in range(3):
    numbers.append(int(input()))
num = numbers[0] * numbers[1] * numbers[2]

arr = [0] * 10

for i in str(num):
    arr[ord(i) - ord('0')] += 1

for i in arr:
    print(i)