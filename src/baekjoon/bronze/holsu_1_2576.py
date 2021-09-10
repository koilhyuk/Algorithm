
b=[]
for _ in range(7):
    a = int(input())
    if a %2:
        b+=[a]
if not b:
    print(-1)
else:
    print(sum(b))
    print(min(b))
