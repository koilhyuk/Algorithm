N, W ,H ,L = map(int,input().split())
# 각 길이 넓이를 L로 나눠떨어지는 몫을 구한다.(정사각형이기 때문에)
a=(W//L)*(H//L)
print(N) if a > N else print(a)
