valList = list(map(int, input().split()))
nameList=["Soongsil","Korea","Hanyang "]

print("OK")if sum(valList)>=100 else print(nameList[valList.index(min(valList))])
