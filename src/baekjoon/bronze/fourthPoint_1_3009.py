a = []
b = dict()
c = dict()

for i in range(3):
    a += list(map(int, input().split()))
    
for i in range(6):
    if not (i % 2):
        if b.keys() is not None and a[i] in b.keys():
            b.update({a[i]:b[a[i]]+1})
        else:
            b[a[i]] = 1
    else:
        if c.keys() is not None and a[i] in c.keys():
            c.update({a[i]:c[a[i]]+1})
        else:
            c[a[i]] = 1

for i in b.keys():
    if b[i] == 1:
        print(i,end=' ') 
        
for i in c.keys():
    if c[i] == 1:
        print(i,end=' ') 
