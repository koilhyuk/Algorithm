import math
N, M, K = map(int,input().split())
tim = 0
if N >= 2*M:
    tim = M
    N -= 2*M
    M -= M
else:
    tim = N//2
    N -= tim*2
    M -= tim

if K >= N+M:
    K-=N+M
    if K>0:
        tim-=math.ceil(K/3)
print(tim)    
