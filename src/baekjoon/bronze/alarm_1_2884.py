a,b = map(int, input().split())

if b<45:
    a-=1
    b+=15
else:
    b-=45

if a<0:
    a=24+a
    
print(a, b)
