str1 = str(input())
str2 = str(input())

arr = [0 for _ in range(26)]

for i in range(len(str1)):
    arr[ord(str1[i]) - ord('a')] += 1

for i in range(len(str2)):
    arr[ord(str2[i]) - ord('a')] -= 1

sum = 0
for i in arr:
    if (i != 0):
        sum += abs(i)

print(abs(sum))
