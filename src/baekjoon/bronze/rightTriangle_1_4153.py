while True:
    a = list(map(int,input().split()))
    if a.count(0)==3:
        break
    else:
        a.sort()
        if a.pop()**2==a.pop()**2+a.pop()**2:
            print("right")
        else:
            print("wrong")
