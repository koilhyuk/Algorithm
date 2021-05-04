package programers.step1;

import java.util.Arrays;

public class Budget_1_12982 {

	public static void main(String[] args) {
//		int[] d = { 1, 3, 2, 5, 4 };
		int[] d = { 2, 2, 3, 3 };
//		int budget = 9;
		int budget = 10;

		int answer = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			if (budget >= d[i]) {
				budget -= d[i];
				answer++;
			} else {
				break;
			}
		}

		System.out.println(answer);
	}
}
// python solution
//y = sorted(d, reverse=True)
//while(len(y)):
//    budget-=y.pop()
//    if budget >= 0 :
//        answer+=1
//    else :
//        break