num = int(input())
total = 0
for _ in range(num):
    a = list(map(int,input().split()))
    if a[0] <= a[1]:
        a[1]%=a[0] 
    total += a[1]
print(total)
