a = list(map(int,input().split()))
b = list(map(int,input().split()))
result = 0
for i in range(3):
    if b[i]-a[i] >= 0:
        result+=b[i]-a[i]
print(result)
