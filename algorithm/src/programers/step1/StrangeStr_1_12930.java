package programers.step1;

public class StrangeStr_1_12930 {
	public static void main(String[] args) {

		String s = "try hello world";
		String answer = "";

		String[] temp = s.split(" ", -1);
		String ch = "";

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length(); j++) {
				ch = String.valueOf(temp[i].charAt(j));
				answer += j % 2 == 0 ? ch.toUpperCase() : ch.toLowerCase();
			}
			if (i < temp.length - 1) {
				answer += " ";
			}
		}

		System.out.print(answer);

	}
}
