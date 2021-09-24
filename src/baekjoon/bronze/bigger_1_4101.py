while True:
    a = list(map(int,input().split()))
    if a.count(0) < 2:
        if a[0] > a[1]:
            print("Yes")
        else:
            print("No")
    else:
        break
