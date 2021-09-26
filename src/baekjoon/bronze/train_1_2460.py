result=0
cur= 0
for _ in range(10):
    a = list(map(int,input().split()))
    cur+=a[1]-a[0]
    if result <= cur:
        result= cur
print(result)
