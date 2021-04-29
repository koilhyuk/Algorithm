package programers.step1;

public class CaesarCipher_1_12926 {
	public static void main(String[] args) {
		String s = "a B z";
		int n = 4;
		String answer = "";
		char chkChar = ' ';
		int mok = (n - (n % 26)) / 26;
		if (mok > 0) {
			n = n - mok * 26;
		}
		System.err.println("n : " + n);
		for (int i = 0; i < s.length(); i++) {
			chkChar = s.charAt(i);
			if (chkChar >= 'a' && chkChar <= 'z') {
				answer += chkChar + n > 'z' ? (char) ('a' + n - ('z' - chkChar)-1) : (char) (chkChar + n);
			} else if (chkChar >= 'A' && chkChar <= 'Z') {
				System.err.println((char) (chkChar + n) + " / " + (char) (('A' + n - ('Z' - chkChar))));
				answer += chkChar + n > 'Z' ? (char) ('A' + n - ('Z' - chkChar)-1) : (char) (chkChar + n);
			} else {
				answer += ' ';
			}
		}

		System.err.println(answer);

	}
}
