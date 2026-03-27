L = int(input())
for _ in range(L):
    right = []
    left = []
    str1 = list(input())
    for i in str1:
        if (i == "<"):
            if left:
                right.append(left.pop())
        elif (i == ">"):
            if right:
                left.append(right.pop())
        elif (i == "-"):
            if left:
                left.pop()
        else:
            left.append(i)
    right.reverse()
    print(''.join(left + right))