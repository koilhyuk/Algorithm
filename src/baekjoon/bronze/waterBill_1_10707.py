a=int(input())
b=int(input())
c=int(input())
d=int(input())
e=int(input())

xMon = a *e
if e <= c:
    yMon = b
else:
    yMon = (e-c)*d+b

print(min(xMon,yMon))
