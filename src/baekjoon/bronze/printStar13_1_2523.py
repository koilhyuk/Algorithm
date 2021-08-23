a = 2*int(input())-1
b = 0
for i in range(a):
    if a//2 <= i-1:
        b-=1
    else:
        b+=1
    print("*"*b) 
