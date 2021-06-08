inList = list(map(int, input().split()))
inList[2]+= int(input())
tiList = [24,60,60]

for i in reversed(range(len(inList))):
    if inList[i] >= tiList[i]:
        if i > 0:
            inList[i-1]+= inList[i] // tiList[i]
        inList[i] %= tiList[i]
        
for j in inList:
    print(j, end=" ")
