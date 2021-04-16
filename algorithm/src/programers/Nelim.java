package programers;

import java.util.Arrays;

public class Nelim {

	public static void main(String[] args) {

		long n = 118372;

		long answer = 0;

		String[] tempVal = (n + "").split("");
		int[] tempArr = Arrays.stream(tempVal).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(tempArr);
		for (int i = tempArr.length - 1; i >= 0; i--) {
			answer += tempArr[i] * (Math.pow(10, tempArr.length - (tempArr.length - i)));
		}
		
		System.err.println(answer);
		
	}
}
