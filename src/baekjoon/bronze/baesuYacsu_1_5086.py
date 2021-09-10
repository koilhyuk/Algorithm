while True:
    a = list(map(int, input().split()))
    if a.count(0)!=2:
        if a[0] > a[1]:
            if not a[0] % a[1]:
                print("multiple")
            else:
                print("neither")
        else:
            if not a[1] % a[0]:
                print("factor")
            else:
                print("neither")
    else:
        break
