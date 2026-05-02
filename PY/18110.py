import sys
input = sys.stdin.readline

def m_round(o):
    return int(0.5 + o)
N = int(input().strip())
if N == 0:
    print(0)
    sys.exit()

arr = [int(input().strip()) for _ in range(N)]
r = m_round(N * 0.15)
arr.sort()
if r > 0:
    arr = arr[r:-r]

print(m_round(sum(arr) / len(arr)))