package programers.step1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoMaxMin_1_77484 {
	public static void main(String[] args) {
//		1	6개 번호가 모두 일치
//		2	5개 번호가 일치
//		3	4개 번호가 일치
//		4	3개 번호가 일치
//		5	2개 번호가 일치
//		6(낙첨)	그 외
//	lottos	win_nums	result
//	[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
//	[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
//	[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
		int[] lottos = { 0, 0, 0, 0, 0, 0 };
		int[] win_nums = { 38, 19, 20, 40, 15, 25 };
		int[] answer = new int[2];
		int maxNum = 0;
		int minNum = 0;
		List<Integer> list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

		for (int i : lottos) {
			if (list.contains(i) || i == 0) {
				maxNum++;
			}
			if (list.contains(i)) {
				minNum++;
			}
			
		}
		answer[0] = maxNum==0?6:7-maxNum;
		answer[1] = minNum==0?6:7-minNum;

		for (int i : answer) {
			System.err.println(i);
		}
	}

}
