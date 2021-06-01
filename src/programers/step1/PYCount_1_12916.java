package programers.step1;

public class PYCount_1_12916 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		boolean answer = true;

		String temp = "";
		int pNum = 0;
		int yNum = 0;

		temp = s.toLowerCase();
		System.out.println(temp);

		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == 'p') {
				pNum += 1;
			}

			if (temp.charAt(i) == 'y') {
				yNum += 1;
			}
		}
		System.err.println(answer = !(pNum != yNum));
	}
}
