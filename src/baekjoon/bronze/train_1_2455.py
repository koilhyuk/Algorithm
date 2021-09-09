a = 0
mx = 0
for _ in range(4):
    b, c = map(int, input().split())
    a+= c-b
    if mx < a:
        mx = a
print(mx)
