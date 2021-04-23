package programers.step1;

public class BigNumMake_1_42883 {

	public static void main(String[] args) {

		String number ="1924";//94
//		String number = "1231234";// 3234
		
		
//		String number = "4177252841";// 775841
		String answers = "";
		int k = 2;
		char max = '0';
		int subInx1 = 0;
		boolean flag = false;
		while (k != 0) {
			max = '0';
			subInx1 = 0;
			for (int i = 0; i < k; i++) {
				if (flag) {
					i = 0;
					if (i != k - 1 && number.charAt(i) < number.charAt(i + 1)) {
						System.err.println(number.charAt(i));
						System.err.println(i);
						subInx1 = i;
						break;
					} else {
						System.err.println("flag else");
						subInx1 = k - 1;
						k = 1;
						flag = true;
					}
				} else {
					if (max < number.charAt(i)) {
						max = number.charAt(i);
						if (k != 1) {
							subInx1 = i;
						} else {
							k = number.length();
							flag = true;
						}
					}
				}
				System.err.println("max : " + max);
				System.err.println("idx : " + subInx1);
				System.err.println("k : " + k);
				System.err.println("number:" + number);
				System.err.println("flag : " + flag);
				System.err.println("-------------");
			}

			if (k != 1) {
				if (!flag) {
					answers += number.substring(subInx1, subInx1 + 1);
					number = number.substring(subInx1 + 1);
					System.err.println(answers);
					k -= subInx1;
				} else {
					System.err.println("else");
					number = number.substring(subInx1 + 1);
					System.err.println(number);
					answers += number;
					k = 0;
				}
			}
		}
		System.err.println("answers : " + answers);
	}
}
