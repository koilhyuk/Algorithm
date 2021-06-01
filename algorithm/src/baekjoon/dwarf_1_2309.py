난쟁이 python solution
list = [int(input()) for i in range(9)]
list.sort()
a=sum(list)-100

for i in range(0,len(list)):
    for j in range(i+1,len(list)):
        if a == list[i]+list[j]:
            list.pop(j)
            list.pop(i)
            break

for h in list:
    print(h)
