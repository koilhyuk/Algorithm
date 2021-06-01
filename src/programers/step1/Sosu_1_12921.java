package programers.step1;

public class Sosu_1_12921 {

	public static void main(String[] args) {
		int answer = 0;

		int n = 10;
		int nonSosu =0;
		for (int i = n; i > 1; i--) {
			for (int j = n - 1; j > 1; j--) {
				if (i % j == 0 && i != j) {
					nonSosu += 1;
					System.err.println(i + " / " + j);
					break;
				}
			}
		}

		answer = n-1-nonSosu;
	}
}
