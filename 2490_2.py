for i in range(3):
    numbers = list(map(int, input().split()))
    numbers.sort()
    a, b, c, d = numbers[0], numbers[1], numbers[2], numbers[3]

    if (a == d):
        if (a == 0):
            print('D')
        else:
            print('E')
    elif (a == c):
        print('C')
    elif(b == d):
        print('A')
    elif(a == b and c == d):
        print('B')