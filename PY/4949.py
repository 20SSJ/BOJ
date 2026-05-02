import sys

while(True):
    str1 = sys.stdin.readline().rstrip()
    if (str1 == "."):
        break
    result = []
    for i in str1:
        if i in ("(", "[", "{") :
            result.append(i)
        elif i == ")":
            if not result or result.pop() != "(":
                print("no")
                break
        elif i == "]":
            if not result or result.pop() != "[":
                print("no")
                break
        elif i == "}":
            if not result or result.pop() != "{":
                print("no")
                break
        elif i == ".":
            if len(result) == 0:
                print("yes")
            else:
                print("no")
            break
