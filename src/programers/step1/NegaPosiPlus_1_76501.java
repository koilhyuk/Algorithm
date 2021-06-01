package programers.step1;

public class NegaPosiPlus_1_76501 {
	public static void main(String[] args) {

		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };

		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i];
		}

		System.err.println(answer);
	}
}
