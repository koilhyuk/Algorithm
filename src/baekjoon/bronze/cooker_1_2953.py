mx = 0
mxScore = 0
for i in range(5):
    a = sum(list(map(int,input().split())))
    if mxScore <= a:
        mx = i+1
        mxScore=a
print(mx, mxScore)
