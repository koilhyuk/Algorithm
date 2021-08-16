a= list(map(int, input().split()))
b= list(map(int, input().split()))
c =a+b
minX = 10;
maxX = 0;
minY =10 ;
maxY = 0;
for i in range(len(c)):
    if not i % 2:
        if c[i] < minX:
            minX =c[i]
        if c[i] > maxX:    
            maxX=c[i]
    else:
        if c[i] < minY:
            minY =c[i]
        if c[i] > maxY:    
            maxY=c[i]
print(max(maxX-minX,maxY-minY)**2)
