# python solution
y = sorted(d, reverse=True)
while(len(y)):
    budget-=y.pop()
    if budget >= 0 :
        answer+=1
    else :
        break
