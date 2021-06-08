inp = int(input())
a = 5* 60
b= 1*60
c = 10
result = [0]*3
if inp%10:
    print(-1)
else:
    if inp >= a:
        result[0]=inp // a
        inp %= a
    if inp >= b:
        result[1]=inp // b
        inp %= b
    if inp >= c:
        result[2]=inp // c
        inp %= c
    for i in result:
        print(i, end=" ") 
