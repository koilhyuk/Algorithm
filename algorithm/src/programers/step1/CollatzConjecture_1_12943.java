package programers.step1;

public class CollatzConjecture_1_12943 {

	public static void main(String[] args) {

		double num = 6;
		int answer = 0;
		while (true) {
			if (num == 1) {
				break;
			} else {
				if (answer >= 500) {
					answer = -1;
					break;
				}

				if (num % 2 == 0) {
					num /= 2;
				} else {
					num = num * 3 + 1;
				}
				answer++;
			}
		}

//		return answer;
		System.err.println(answer);
	}
}
