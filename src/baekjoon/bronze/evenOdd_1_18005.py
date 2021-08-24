# 입력 값을 2로 나눴을 때 나머지 있는 것과 없는 것으로 나뉜다. 
# 나머지 있으면 .5 홀짝 둘다 가능 0
# 나머지가 없다면 홀/짝으로 나눠 홀수라면 1, 짝수라면 2
inp = int(input())
if not inp % 2:
    inp /=2
    print(2 if not inp % 2 else 1)
else:
    print(0)
