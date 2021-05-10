package programers.step1;

public class Failure_1_42889 {

}

// python solution1
// 람다 이외의 방법 고민 ... dictionary 안에 담긴 값 정렬 하는 코드 고민.
//
//
//testdiction ={}
//stagelen =len(stages)
//stages.sort()
//print(stages)
//for i in range(1, N+1):
//    idx = 0
//    cnt = stages.count(i)
//    cal = 0.0 if not cnt else cnt/stagelen
//    testdiction[i]=cal
//    stagelen -= cnt
//
// answer = sorted(testdiction, key = lambda x:  testdiction[x], reverse=True)
//    
//print(testdiction)
//print(answer)

// python solution2
//N = 6
//# stages = [2,1,2,6,2,4,3,3]
//stages = [2,2,2,2,4,4]
//# N = 4
//# stages = [4,4,4,4,4]
//answer=[]
//
//testdiction ={}
//stagelen =len(stages)
//stages.sort()
//print(stages)
//for i in range(1, N+1):
//    idx = 0
//    cnt = stages.count(i)
//    cal = 0.0 if not cnt else cnt/stagelen
//    testdiction[i]=cal
//    stagelen -= cnt
//
//for j in testdiction.keys():
//    idx = 0
//    for i in answer:
//        if testdiction.get(i) <  testdiction.get(j):
//            idx+=1
//        else:
//            break
//    answer.insert(idx, j)
//answer.reverse()
//print(testdiction)
//print(answer)


