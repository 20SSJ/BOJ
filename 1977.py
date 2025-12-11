import sys
import math
input = sys.stdin.readline

a = int(input())
b = int(input())
sqr = []
for i in range(b - a + 1):
    sq = math.sqrt(a+i)
    if(int(sq) * int(sq) == a+i):
        sqr.append(a+i)
if (len(sqr)):
    print(sum(sqr))
    print(min(sqr))
else:
    print(-1)