package programers.step1;

public class XBetweenN_1_12954 {
	public static void main(String[] args) {
		int x = -4;
		int n = 22;

		long[] answer = new long[n];

		for (int i = 0; i < n; i++) {
			if (i != 0) {
				answer[i] = answer[i - 1] + x;
			} else {
				answer[i] = x;
			}
		}

		for (long l : answer) {
			System.err.println(l);
		}

	}
}
