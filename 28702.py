import sys
input = sys.stdin.readline

def FB(j):
            if(j % 3 == 0 and j % 5 == 0):
                print("FizzBuzz")
            elif(j % 3 == 0 and j % 5 != 0):
                print("Fizz")
            elif(j % 3 != 0 and j % 5 == 0):
                print("Buzz")
            else:
                print(j)
    
arr = []
for i in range(3):
    f = input().strip()
    arr.append(f)
    if i == 2:
        if f.isdigit():
            n = int(f)
            n += 1
            FB(n)
        else:
            if arr[i - 1].isdigit():
                n = int(arr[i-1])
                n += 2
                FB(n)
            else:
                n = int(arr[i-2])
                n += 3
                FB(n)