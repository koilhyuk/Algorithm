package programers.step1;

public class KaoHand_1 {
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
//
//numbers 배열의 크기는 1 이상 1,000
//이하입니다.
//numbers 배열
//원소의 값은 0 이상 9
//이하인 정수입니다.hand는"left"또는"right"입니다."left"
//는 왼손잡이,"right"
//는 오른손잡이를
//의미합니다.왼손 엄지손가락을
//사용한 경우는 L,
//오른손 엄지손가락을
//사용한 경우는
//R을 순서대로
//이어붙여 문자열 형태로 return 해주세요
//.
//
//[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL" LRLLLRLLRRL
//[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR" LLLLRRLLLRR
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL" 