import math
leng,h,w = map(int,input().split())
x = leng/math.sqrt(h**2+w**2)
print(math.floor(h*x),math.floor(w*x))
