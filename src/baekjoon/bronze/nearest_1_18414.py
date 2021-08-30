X,L,R =map(int, input().split())
result = [abs(X-i) for i in range(L,R+1) ]
print(L+result.index(min(result)))
