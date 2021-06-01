package programers.step1;

import java.util.Arrays;

public class DivisorArray_1_12910 {

	public static void main(String[] args) {

		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;

		int[] answer = {};
		int arrSize = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				arrSize++;
			}
		}
		int idx = 0;
		answer = arrSize == 0 ? new int[] { -1 } : new int[arrSize];
		if (arrSize != 0) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divisor == 0) {

					answer[idx] = arr[i];
					System.out.println(answer[idx]);
					idx++;
				}
			}
			Arrays.sort(answer);
		}

		for (int i : answer) {
			System.err.println(i);
		}

	}
}
