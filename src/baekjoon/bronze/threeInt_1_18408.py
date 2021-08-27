a = list(map(int,input().split()))
b = a.count(1)
c = a.count(2)
print(1 if b>c else 2)
