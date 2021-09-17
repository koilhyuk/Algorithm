a,b = map(int,input().split())
c = [1]
for i in range(2, a//2+1):
    if not a%i:
        c+=[i]
c+=[a]
if b > len(c):
    print(0)
else:
    print(c[b-1])
