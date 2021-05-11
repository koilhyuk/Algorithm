package programers.step1;

public class Failure_2_42889 {

}

// python solution 3
//def solution(N, stages):
//    answer = []
//    testdiction ={}
//    stagelen =len(stages)
//    
//    for i in range(1,N+1):
//        cnt = stages.count(i)
//        cal =0.0 if not cnt else cnt/stagelen
//        testdiction[i]=cal
//        stagelen -=cnt
//        idx = 0
//        for j in answer:
//            if testdiction.get(j) <  testdiction.get(i):
//                idx+=1
//            else:
//                break
//        answer.insert(idx, i)
//    answer.reverse()
// return answer