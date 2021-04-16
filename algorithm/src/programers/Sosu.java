package programers;

import java.util.Iterator;

public class Sosu {

	public static void main(String[] args) {
		int n = 3;
		int answer = 0;

		boolean[] tempArr = new boolean[n - 1];

		boolean flag = false;

		for (int i = 2; i <= n; i++) {
//			flag = false;
			for (int j = i + 1; j < n; j++) {
//				System.err.print("i : " + i + " / " + "j :" + j);
				if (j != i && j % i == 0) {
					System.err.println(i);
					tempArr[j - 2] = true;
					// flag = true;
				}
			}
//			if (!flag) {
//				System.err.println("sosu");
//				answer++;
//			}
//			System.err.println();
		}

		for (boolean i : tempArr) {
			if (i)
				answer++;
		}
		System.err.println(answer);
	}// main
}// sosu
