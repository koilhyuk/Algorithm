a = [input() for _ in range(6)]

if a.count("W") >= 5:
    print(1)
elif a.count("W") >= 3:
    print(2)
elif a.count("W") >= 1:
    print(3)
else:
    print(-1)
