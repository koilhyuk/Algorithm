#python solution2
N = 6
# stages = [2,1,2,6,2,4,3,3]
stages = [2,2,2,2,4,4]
# N = 4
# stages = [4,4,4,4,4]
answer=[]

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

for j in testdiction.keys():
    idx = 0
    for i in answer:
        if testdiction.get(i) <  testdiction.get(j):
            idx+=1
        else:
            break
    answer.insert(idx, j)
answer.reverse()
print(testdiction)
print(answer)
