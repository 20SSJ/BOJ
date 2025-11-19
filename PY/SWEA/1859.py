import sys

input = sys.stdin.readline

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    sum = 0
    a = int(input())
    numbers = list(map(int, input().split()))
    mx = max(numbers)
    if(mx != numbers[0]):
        mx = numbers[-1]
        for num in reversed(numbers):
            if (num > mx):
                mx = num
            else:
                sum += mx - num
    print(f"#{test_case} {sum}")
