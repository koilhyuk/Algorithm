package programers.step1;

public class HidePhoneNum_1_12948 {
	public static void main(String[] args) {

		String phone_number = "01033334444";
		String answer = "";
		for (int i = 0; i < phone_number.length(); i++) {

			answer += i < phone_number.length() - 4 ? "*" : phone_number.charAt(i);
		}
		System.err.println(answer);
	}

}
