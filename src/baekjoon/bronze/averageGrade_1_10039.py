a = 0
for i in range(5):
    temp = int(input())
    a += temp if temp >= 40 else 40

b = int(a/5)
print(b)
