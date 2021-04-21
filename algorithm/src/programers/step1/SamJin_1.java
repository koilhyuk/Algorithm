package programers.step1;

import java.util.ArrayList;
import java.util.List;

public class SamJin_1 {
	public static void main(String[] args) {
		int n = 45;
		int answer = 0;

//		String a = "";
//
//		while (n > 0) {
//			a = (n % 3) + a;
//			n /= 3;
//			System.err.println(a);
//		}
//		a = new StringBuilder(a).reverse().toString();
//		System.err.println(a);
//		System.err.println(Integer.parseInt(a, 3));
		List<Integer> tempList = new ArrayList<Integer>();

		int sam = 3;
		int mok = 0;
		int val = n;
		while (val >= sam) {
			mok = val % sam;
			tempList.add(mok);
			val = val / sam;
		}
		tempList.add(val);
		for (int i = 0; i < tempList.size(); i++) {
			answer += tempList.get(i) * Math.pow(3, (tempList.size() - i - 1));
		}

		System.err.println(answer);
	}

}

//1+3+18+
//45	1200	0021	7