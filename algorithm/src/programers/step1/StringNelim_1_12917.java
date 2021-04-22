package programers.step1;

public class StringNelim_1_12917 {
	public static void main(String[] args) {
		String s = "Zbcdefg";

		String answer = null;
		char[] s1 = s.toCharArray();
		char temp = ' ';

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s1.length - i - 1; j++) {
				if (s1[j] <= s1[j + 1]) {
					temp = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = temp;
				}
			}
		}
		answer = new String(s1);
		System.err.println(answer);
	}
}
