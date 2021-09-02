P1, S1 = map(int ,input().split())
S2, P2 = map(int, input().split())

P3 = P1+P2
S3 = S1+S2

if P3> S3:
    print("Persepolis")
elif P3 < S3:
    print("Esteghlal")
else:
    if S1 > P2:
        print("Esteghlal")
    elif S1 < P2:
        print("Persepolis")
    else:
        print("Penalty")
