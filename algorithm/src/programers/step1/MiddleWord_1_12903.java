package programers.step1;

public class MiddleWord_1_12903 {
	public static void main(String[] args) {
		String s = "abcde";

		String answer = "";
		char[] tempCh = null;

		int inLength = s.length();

		if (inLength % 2 == 0) {
			tempCh = new char[2];
			tempCh[0] = s.charAt(inLength / 2 - 1);
			tempCh[1] = s.charAt(inLength / 2);

		} else {
			tempCh = new char[1];
			tempCh[0] = s.charAt(inLength / 2);
		}
		answer = new String(tempCh);

		System.err.println(answer);

	}
}
