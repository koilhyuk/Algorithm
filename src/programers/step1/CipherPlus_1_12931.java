package programers.step1;

public class CipherPlus_1_12931 {
	public static void main(String[] args) {

		int n = 123;
		int answer = 0;
		String temp = n + "";

		for (int i = 0; i < temp.length(); i++) {
			answer += Integer.parseInt(temp.charAt(i) + "");
			System.out.println(temp.charAt(i));

		}
		System.err.println(answer);
//		return answer;
	}
}
