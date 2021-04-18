package programers;

public class Chellenge2_1 {
	public static void main(String[] args) {

//		int[] abs = { 4, 7, 12 };
		int[] abs = { 1, 2, 3 };
//		boolean[] sig = { true, false, true };
		boolean[] sig = { false, false, true };
		int answer = 0;

		for (int i = 0; i < abs.length; i++) {
			answer = sig[i] ? answer + abs[i] : answer - abs[i];
		}

		System.out.println(answer);

	}

}
