num = int(input())
for _ in range(num):
    a = int(input())
    b = 0.0
    c = 0.0
    for _ in range(a):
        d = list(map(float, input().split()))
        b+=d[0]
        c+=d[1]*d[0]
    print(int(b), round(c/b,1))
