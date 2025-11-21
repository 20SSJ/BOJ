import sys
input = sys.stdin.readline

T = 10
for _ in range(T):
    a = int(input())
    str1 = input().strip()
    sentence = input().strip()
    result = sentence.count(str1)
    print (f"#{a} {result}")