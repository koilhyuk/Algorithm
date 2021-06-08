a =list(map(int, input().split()))
b =list(map(int, input().split()))
print(a[1]+b[0]) if a[0]+b[1] >= a[1]+b[0] else print(a[0]+b[1])
