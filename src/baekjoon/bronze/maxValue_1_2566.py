mx = 0
point =[0,0]
for i in range(9):
    inList = list(map(int, input().split()))
    for j in range(9):
        if mx < inList[j]:
            mx = inList[j]
            point = [i+1, j+1]
print(mx)
print(point[0], point[1])
