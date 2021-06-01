# python solution1
# 람다 이외의 방법 고민 ... dictionary 안에 담긴 값 정렬 하는 코드 고민.


testdiction ={}
stagelen =len(stages)
stages.sort()
print(stages)
for i in range(1, N+1):
    idx = 0
    cnt = stages.count(i)
    cal = 0.0 if not cnt else cnt/stagelen
    testdiction[i]=cal
    stagelen -= cnt

 answer = sorted(testdiction, key = lambda x:  testdiction[x], reverse=True)
    
print(testdiction)
print(answer)
