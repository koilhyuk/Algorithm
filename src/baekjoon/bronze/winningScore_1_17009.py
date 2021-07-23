fg = True
a=0
b=0
score = 3
for i in range(6):
    c=int(input())
    if fg:
        a+= c*score
    else:
        b += c*score

    score -= 1
    
    if i == 2:
        fg = False
        score = 3
    elif i == 5:
        if a>b:
            print('A')
        elif a<b:
            print('B')
        else:
            print('T')
