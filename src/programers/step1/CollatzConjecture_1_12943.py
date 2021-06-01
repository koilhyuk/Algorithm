# python solution
while(num!=1):
    if(answer>500):
        return -1
        break
    answer+=1
    num = num*3+1 if num%2 else num/2

return answer
