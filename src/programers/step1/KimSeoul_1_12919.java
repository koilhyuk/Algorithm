package programers.step1;

public class KimSeoul_1_12919 {

	public static void main(String[] args) {

		String[] seoul = { "Jane", "Kim" };
		String answer = "김서방은 ";

		for (int i = 0; i < seoul.length; i++) {
			answer += "Kim".equals(seoul[i]) ? i + "에 있다" : "";
		}
//		return answer;
		System.err.println(answer);
	}
}
