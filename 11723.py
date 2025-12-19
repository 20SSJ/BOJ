import sys
input = sys.stdin.readline

s = set()
M = int(input().strip())
for _ in range(M):
    a = input().split()
    cmd = a[0]
    if cmd == "all":
        s.clear()
        s = set(range(1, 21))
        continue
    elif cmd =="empty":
        s.clear()
        continue
    n = int(a[1])
    if cmd == "add":
        s.add(n)
    elif cmd == "check":
        if n in s:
            print(1)
        else:
            print(0)
    elif cmd == "remove":
        if n in s:
            s.remove(n)
    elif cmd =="toggle":
        if n in s:
            s.remove(n)
        else:
            s.add(n)