D,H,M = map(int, input().split())
inM = H*60+M
stM = 11*60+11
dM = (D-11)*24*60
if D > 11:
    print(dM-stM+inM)
else:
    if inM <stM:
        print("-1")
    else:
        print(inM-stM)
