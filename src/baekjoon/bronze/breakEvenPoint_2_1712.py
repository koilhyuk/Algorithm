tempList = list(map(int, input().split()))
pure=tempList[2]-tempList[1]
print(int(-1)) if pure <= 0 else print(int((tempList[0]/pure)+1))
