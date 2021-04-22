package programers.step1;

public class AliquotTotal_1_12928 {
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

//		return answer;
		System.err.println(answer);
	}
}
