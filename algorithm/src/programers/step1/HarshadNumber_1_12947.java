package programers.step1;

public class HarshadNumber_1_12947 {

	public static void main(String[] args) {

		int x = 10;
		boolean answer = true;
		String tempX = String.valueOf(x);
		int sum = 0;

		for (int i = 0; i < tempX.length(); i++) {
			sum += tempX.charAt(i) - '0';
		}

		if (x % sum != 0) {
			answer = false;
		}

//		return answer;

		System.err.println(answer);

	}
}
