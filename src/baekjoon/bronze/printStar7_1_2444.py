num = 2*int(input())-1
em = num//2+1
st = -1
for i in range(num):
    if i > num//2:
        em+=1
        st-=2
    else:
        em-=1
        st+=2
    print(' '*em,end='')    
    print('*'*st,end='')
    print('')
