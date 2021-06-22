a,b,c,d,e= int(input()),int(input()),int(input()),int(input()),int(input())
result=0
if a < 0:
    result+=c*abs(a)
    result+=d
    result+=e*(b)
elif a > 0:
    result+=e*(b-a)
print(result)
