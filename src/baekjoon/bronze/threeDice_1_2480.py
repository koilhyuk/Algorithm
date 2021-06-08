a = list(map(int,input().split()))
dictn = {}

for i in a:
    if i in dictn.keys():
        dictn[i]+=1
    else:
        dictn.update({i:1})
tempVal=max(dictn.values())

if tempVal ==1:
    print(max(dictn)*100)
elif tempVal == 2:
    for key , value in dictn.items():
        if value == 2:
            print(1000+key*100)
else:
    print(10000+max(dictn)*1000)
