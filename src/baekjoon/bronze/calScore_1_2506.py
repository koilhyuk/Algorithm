num = int(input())
arr = list(map(int,input().split()))
total=0
score=1
for i in range(num):
    if arr[i] == 1:
        total+= score
        score+=1
    else:
        score=1
print(total)
