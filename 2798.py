import sys
input = sys.stdin.readline

N, M = map(int, input().split())
nums = list(map(int, input().split()))

nums.sort()
result = 0
bflag = True

for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            sum_T = nums[i] + nums[j] + nums[k]

            if(sum_T > M):
                break

            if(result < sum_T):
                result = sum_T

            if(sum_T == M):
                bflag = False
                print(M)
                exit()
            
print(result)
