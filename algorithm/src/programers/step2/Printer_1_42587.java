package programers.step2;

public class Printer_1_42587 {
	public static void main(String[] args) {

		int[] priorities = { 2, 1, 3, 2 };
//		int[] priorities = {1, 1, 9, 1, 1, 1};	
		int location = 2;
//		int location =0;

		
		
		
		
	}
}


// 좀 더 고민
//# # [2, 1, 3, 2] 2 1
//# [1, 1, 9, 1, 1, 1]
//# priorities = [1, 1, 9, 1, 1, 1]
//location = 0
//# priorities = [2, 1, 3, 2]
//priorities = [1]
//location = 0
//
//temp = sorted(priorities, reverse=True)
//listLen = len(priorities)
//
//while temp != priorities:
//    for i in range(1, len(priorities)):
//        print("location : "+str(location))
//        if priorities[0] < priorities[i]:
//            if location == 0:
//                location = listLen-1
//            else:
//                location -= 1
//            priorities.append(priorities.pop(0))
//            break
//print(priorities)
//print(location)