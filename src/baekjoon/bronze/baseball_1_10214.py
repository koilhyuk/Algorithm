num = int(input())
for _ in range(num):
    a = [0,0]
    for _ in range(9):
        c, d = map(int,input().split())
        a[0] += c
        a[1] += d
    if a[0] > a[1]:
        print("Yonsei")
    elif a[0] < a[1]:
        print("Korea")
    else:
        print("Draw")
