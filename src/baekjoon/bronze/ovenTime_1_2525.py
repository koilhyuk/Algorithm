hr, mt = map(int, input().split())
cooking = int(input())

totalMin =mt + cooking
if totalMin >=60:
    hr+=totalMin//60
    mt = totalMin%60
    if hr > 23:
        hr -=24
else:
    mt=totalMin
    
print(str(hr)+" "+str(mt))
