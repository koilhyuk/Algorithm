num = int(input())
em = 0
st = num*2-1

for i in range(num):
    print(' '*em,end='')    
    print('*'*st,end='')
    print('')
    em +=1
    st -=2
