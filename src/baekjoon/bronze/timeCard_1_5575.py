time =[60*60, 60, 1,60*60, 60, 1]
result=[]
for _ in range(3):
    a = list(map(int, input().split()))
    a = list(map(lambda x,y:x * y,a,time))
    timeGap = sum(a[3:])-sum(a[:3])
    
    h = [timeGap//(60*60),timeGap%(60*60)//60, timeGap%(60*60)%60]
    result.append(h)
for i in result:
    for j in i:
        print(j, end=" ")
    print()
