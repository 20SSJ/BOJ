import sys
input = sys.stdin.readline

ascend = [1, 2, 3, 4, 5, 6, 7 ,8]
descend = [8, 7, 6, 5, 4, 3, 2 ,1]

ex = list(map(int, input().split()))

if ex == ascend:
    print("ascending")
elif ex == descend:
    print("descending")
else:
    print("mixed")
