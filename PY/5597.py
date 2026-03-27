import sys
input = sys.stdin.readline

students = [0] * 30
for _ in range(28):
    a = int(input())
    students[a-1] += 1

arr = []
for i in range(len(students)):
    if students[i] == 0:
        arr.append(i + 1)

print(arr[0])
print(arr[1])
