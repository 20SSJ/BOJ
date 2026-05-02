n = int(input())
sc = list(map(int, input().split()))

sumY = 0
sumM = 0
for i in sc:
    if (i < 30):
        sumY += 10
    else:
        sumY += 10
        a = i - 29
        b = (a // 30) * 10
        sumY += b
        if (a % 30 != 0):
            sumY += 10

for i in sc:
    if (i < 60):
        sumM += 15
    else:
        sumM += 15
        a = i - 59
        b = (a // 60) * 15
        sumM += b
        if (a % 60 != 0):
            sumM += 15

result = 0
if(sumM == sumY):
    fee = "Y M"
    result = sumY
elif(sumM < sumY):
    fee = 'M'
    result = sumM
else:
    fee = 'Y'
    result = sumY
print(fee, result)