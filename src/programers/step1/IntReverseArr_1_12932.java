package programers.step1;

public class IntReverseArr_1_12932 {
	public static void main(String[] args) {

		long n = 12345;
		String temp = String.valueOf(n);
		int[] answer = new int[temp.length()];

		for (int i = temp.length() - 1; i >= 0; i--) {
			answer[temp.length() - i - 1] = Integer.parseInt(String.valueOf(temp.charAt(i)));
		}
		System.err.println(answer);
//		return answer;
	}
}
