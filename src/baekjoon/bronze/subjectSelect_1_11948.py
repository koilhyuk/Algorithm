a=[]
for _ in range(6):
    a +=[int(input())]
    
a.pop(a.index(min(a[:4])))
a.pop(a.index(min(a[3:])))
print(sum(a))
