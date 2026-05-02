import sys
input = sys.stdin.readline

A = input().strip()
B = input().strip()
C = input().strip()

result1 = int(A) + int(B) - int(C)
AB = str(A) + str(B)
result2 = int(AB) - int(C)
print(result1)
print(result2)