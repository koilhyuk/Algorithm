a = input()
leng = len(a)

if leng==2:
    print(int(a[0])+int(a[1]))
elif leng==3:
    print(int(a[:2])+int(a[2:])) if a[1]=='0' else print(int(a[:1])+int(a[1:]))
        
else:
    print(20)
