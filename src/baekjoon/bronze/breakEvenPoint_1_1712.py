tempList = list(map(int, input().split()))

if tempList[1] >= tempList[2]:
    print(int(-1))
else:
    pure=tempList[2]-tempList[1]
    print(int((tempList[0]/pure)+1))
