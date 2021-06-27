N,M,K = map(int, input().split())
print(min(M+N-K,K+N-M))
