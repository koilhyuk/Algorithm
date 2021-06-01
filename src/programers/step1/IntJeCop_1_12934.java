package programers.step1;

public class IntJeCop_1_12934 {
	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		String tmpStr = (Math.sqrt(n) + "");
		String chk1 = tmpStr.substring(0, tmpStr.indexOf("."));
		String chk2 = tmpStr.substring(tmpStr.indexOf(".") + 1);

		answer = -1;

		if (chk2.length() == 1 && chk2.equals("0")) {
			answer = (long) Math.pow(Integer.parseInt(chk1) + 1, 2);
		}

		System.err.println(answer);
	}
}
