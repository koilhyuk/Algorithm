a = int(input())
if not a:
    print('divide by zero')
else:    
    b =list(map(int,input().split()))
    c = set(b)
    d = 0
    e = sum(b)/a
    for i in c:
        d += i*(b.count(i)/a)
    f=str(round(e/d,2))
    if len(f[f.index('.')+1:])!=2:
        f+="0"
    print(f)
