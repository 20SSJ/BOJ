import sys
input = sys.stdin.readline

a, b = map(int, input().split())

bool = True
if a == 1:
    if b == 2:
        bool = False
        print("B")
elif a == 2:
    if b == 3:
        bool = False
        print("B")
else:
    if b == 1:
        bool = False
        print("B")
if(bool):
    print("A")