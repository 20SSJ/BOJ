for i in range(3):
    numbers = list(map(int, input().split()))

    zeros = numbers.count(0)

    if (zeros == 1):
        print('A')
    elif (zeros == 2):
        print('B')
    elif (zeros == 3):
        print('C')
    elif (zeros == 4):
        print('D')
    else:
        print('E')