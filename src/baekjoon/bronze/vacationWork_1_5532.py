import math
import sys
a= int(sys.stdin.readline())
b=int(sys.stdin.readline())
c=int(sys.stdin.readline())
d=int(sys.stdin.readline())
e=int(sys.stdin.readline())

print(a-math.ceil(b/d)) if b/d > c/e else print(a-math.ceil(c/e))
