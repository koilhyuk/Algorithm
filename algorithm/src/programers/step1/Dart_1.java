package programers.step1;

import java.util.HashMap;
import java.util.Map;

public class Dart_1 {
//	1	1S2D*3T		37	1^1 * 2 + 2^2 * 2 + 3^3
//	2	1D2S#10S	9	1^2 + 2^1 * (-1) + 10^1
//	3	1D2S0T		3	1^2 + 2^1 + 0^3
//	4	1S*2T*3S	23	1^1 * 2 * 2 + 2^3 * 2 + 3^1
//	5	1D#2S*3S	5	1^2 * (-1) * 2 + 2^1 * 2 + 3^1
//	6	1T2D3D#		-4	1^3 + 2^2 + 3^2 * (-1)
//	7	1D2S3T*		59	1^2 + 2^1 * 2 + 3^3 * 2
	public static void main(String[] args) {
		int answer = 0;
		String dartResult = "1D2S#10S";

		Dart_1 sol = new Dart_1();

		Map<String, Integer> scMap = new HashMap<>();
		scMap.put("S", 1);
		scMap.put("D", 2);
		scMap.put("T", 3);
		scMap.put("#", -1);
		scMap.put("*", 2);

		int[][] score = new int[3][3];
		int pit = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) >= 65 && dartResult.charAt(i) <= 84) {

//				if (i != 1 && '1' == dartResult.charAt(i - 2) - '0') {
//					score[pit][0] = dartResult.charAt(i - 2) - '0' + dartResult.charAt(i - 1) - '0';
//				} else {
//					score[pit][0] = dartResult.charAt(i - 1) - '0';
//				}
				if (i != 1 && "1".equals(String.valueOf(dartResult.charAt(i - 2)))) {
					score[pit][0] = sol.chrToInt(dartResult.charAt(i - 2), dartResult.charAt(i - 1));
				} else {
					score[pit][0] = sol.chrToInt(dartResult.charAt(i - 1));
				}
				score[pit][1] = scMap.get(String.valueOf(dartResult.charAt(i)));

//				if (i < dartResult.length() - 1 && ("#".equals(String.valueOf(dartResult.charAt(i + 1)))
//						|| "*".equals(String.valueOf(dartResult.charAt(i + 1))))) {
//
//					score[pit][2] = scMap.get(String.valueOf(dartResult.charAt(i + 1)));
//				}
				if (i < dartResult.length() - 1
						&& ('#' == dartResult.charAt(i + 1) || '*' == dartResult.charAt(i + 1))) {
					score[pit][2] = scMap.get(String.valueOf(dartResult.charAt(i + 1)));
				}
				pit++;
			}
		}

		int[] calArr = new int[3];

		for (int i = 0; i < calArr.length; i++) {
			calArr[i] = (int) Math.pow(score[i][0], score[i][1]);
			if (score[i][2] != 0) {
				if (score[i][2] == -1) {
					calArr[i] *= score[i][2];
				} else {
					calArr[i] *= score[i][2];
					if (i != 0) {
						calArr[i - 1] *= score[i][2];
					}
				}
			}
		}
		for (int i : calArr) {
			answer += i;
		}
		System.err.println(answer);

	}// main

	public int chrToInt(char ch1, char ch2) {
		return Integer.parseInt(String.valueOf(ch1) + String.valueOf(ch2));
	}

	public int chrToInt(char ch) {
		return Integer.parseInt(String.valueOf(ch));
	}

}// class
