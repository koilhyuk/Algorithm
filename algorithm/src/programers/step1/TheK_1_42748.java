package programers.step1;

import java.util.Arrays;

public class TheK_1_42748 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];
		int[] tempArr = null;
		int temCnt = 0;

		for (int i = 0; i < commands.length; i++) {
			temCnt = 0;
			tempArr = new int[commands[i][1] - commands[i][0] + 1];

			for (int j = commands[i][0]; j <= commands[i][1]; j++) {
				tempArr[temCnt++] = array[j - 1];
			}
			Arrays.sort(tempArr);
			answer[i] = tempArr[commands[i][2] - 1];
		}

		for (int i : answer) {
			System.err.println(i);
		}
	}
}
