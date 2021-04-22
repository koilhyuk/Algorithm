package programers.step1;

public class StringBasic_1_12918 {
	public static void main(String[] args) {

		String s = "a234";

		boolean answer = true;
		try {
			if (s.length() == 4 || s.length() == 6) {
				Integer.parseInt(s);
			} else {
				answer = false;
			}
		} catch (NumberFormatException nfe) {
			answer = false;
		} finally {
//			return answer;
			System.err.println(answer);
		}
	}
}
