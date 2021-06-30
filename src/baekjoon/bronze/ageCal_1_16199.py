a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = [0, 1, 0]

if b[0]-a[0]:
    c[1]+=b[0]-a[0]
    c[2]+=b[0]-a[0]
    if b[1]-a[1] > 0:
        c[0]+=b[0]-a[0]
    elif b[1]-a[1] == 0:
        if b[2]-a[2] >= 0:
            c[0]+=b[0]-a[0]
        else:
            c[0]+=b[0]-a[0]-1
    else:
        c[0]+=b[0]-a[0]-1
for i in c:
    print(i)
