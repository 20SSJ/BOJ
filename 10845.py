import queue
import sys
q = queue.Queue()

n = int(sys.stdin.readline())
for _ in range(n):
    cmd = sys.stdin.readline().split()
    str1 = cmd[0]
    if (str1 == "push"):
        q.put(cmd[1])
    elif (str1 == "front"):
        if q.empty():
            print(-1)
        else:
            print(q.queue[0])
    elif (str1 == "back"):
        if q.empty():
            print(-1)
        else:
            print(q.queue[-1])
    elif (str1 == "size"):
        print(q.qsize())
    elif (str1 == "empty"):
        if q.empty():
            print(1)
        else:
            print(0)
    elif (str1 == "pop"):
        if q.empty():
            print(-1)
        else:
            print(q.get())