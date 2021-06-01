def solution(N, stages):
    answer = []
    testdiction ={}
    stagelen =len(stages)
    
    for i in range(1,N+1):
        cnt = stages.count(i)
        # cal =0.0 if not cnt else cnt/stagelen
        cal =cnt/stagelen
        
        testdiction[i]=cal
        stagelen -=cnt
        idx = 0
        for j in answer:
            if testdiction.get(j) <  testdiction.get(i):
                idx+=1
            else:
                break
        answer.insert(idx, i)
    answer.reverse()
    # answer = sorted(testdiction, key = lambda x:  testdiction[x], reverse=True)
    
    # for j in testdiction.keys():
    #     idx = 0
    #     for i in answer:
    #         if testdiction.get(i) <  testdiction.get(j)
    #             idx+=1
    #         else:
    #             break
    #     answer.insert(idx, j)

    # answer.reverse()
    return answer
