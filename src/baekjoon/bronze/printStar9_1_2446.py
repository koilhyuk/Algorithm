
num = int(input())
num2 = 2*num-1
emp = 0
for i in range(num2):
    print(" "*emp,end='')
    print("*"*num2)
    if i > num-2:
        num2+=2
        emp-=1
    else:
        num2-=2
        emp+=1
