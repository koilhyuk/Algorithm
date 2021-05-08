package programers.step1;

public class KeyPad_1_67256 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		String hand = "right";
		String answer = "";

		int[][] phone = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { -1, 0, -1 } };
		int[] rHand = { 2, 3 };
		int[] lHand = { 0, 3 };
		boolean loopFlg = false;
		int lLen = 0;
		int rLen = 0;

		for (int i = 0; i < numbers.length; i++) {

			loopFlg = false;
			for (int j = 0; j < phone.length; j++) {
				for (int z = 0; z < phone[j].length; z++) {
					if (numbers[i] == phone[j][z]) {
						lLen = 0;
						rLen = 0;
						if (z == 0) {
							answer += "L";
							lHand[0] = z;
							lHand[1] = j;
						} else if (z == 2) {
							answer += "R";
							rHand[0] = z;
							rHand[1] = j;
						} else {// z==1 가운데 라인
							lLen = Math.abs(z - lHand[0]) + Math.abs(j - lHand[1]);
							rLen = Math.abs(z - rHand[0]) + Math.abs(j - rHand[1]);
							if (lLen > rLen) {
								answer += "R";
								rHand[0] = z;
								rHand[1] = j;
							} else if (rLen > lLen) {
								answer += "L";
								lHand[0] = z;
								lHand[1] = j;
							} else {// 거리가 같음
								if ("right".equals(hand)) {
									answer += "R";
									rHand[0] = z;
									rHand[1] = j;
								} else {
									answer += "L";
									lHand[0] = z;
									lHand[1] = j;
								}
							}
						}
						loopFlg = true;
						break;
					}
				}
				if (loopFlg) {
					break;
				}
			}
		}

	}

}
// python solution
//
//def solution(numbers, hand):
//    key ={1:[0,0],2:[0,1],3:[0,2],4:[1,0],5:[1,1],6:[1,2],7:[2,0],8:[2,1],9:[2,2],0:[3,1]}
//
//    rHand = [3,2]
//    lHand = [3,0]
//    answer =[]
//    for i in numbers:
//        pitIdx = key.get(i)
//        if i == 1 or i == 4 or i ==7:
//            lHand=pitIdx
//            answer.append("L")
//        elif i == 3 or i == 6 or i ==9:
//            rHand=pitIdx
//            answer.append("R")
//        else:
//            lLen = abs(lHand[0]-pitIdx[0])+abs(lHand[1]-pitIdx[1])
//            rLen = abs(rHand[0]-pitIdx[0])+abs(rHand[1]-pitIdx[1])
//            if lLen > rLen:
//                rHand=pitIdx
//                answer.append("R")
//            elif lLen < rLen:
//                lHand=pitIdx
//                answer.append("L")
//            else:
//                if hand == "right":
//                    rHand=pitIdx
//                    answer.append("R")
//                else:
//                    lHand=pitIdx
//                    answer.append("L")
//    return ''.join(answer)