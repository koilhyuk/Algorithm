package programers.step1;

public class Watermelonmel_1_12922 {

	public static void main(String[] args) {
		int n = 3;
		String answer = "";

		for (int i = 0; i < n; i++) {
			answer = (i % 2 == 1 ? answer + "박" : answer + "수");
		}
//		return answer;
		System.err.println(answer);

	}

}
