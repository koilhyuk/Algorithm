a = list(map(int,input().split()))
b = list(map(int,input().split()))

for i in range(a[0]):
    if a[1]> b[i]:
        print(b[i],end=" ")
