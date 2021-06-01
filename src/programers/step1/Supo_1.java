package programers.step1;

import java.util.ArrayList;
import java.util.List;

public class Supo_1 {

	public static void main(String[] args) {
//		1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//		2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//		3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

		int[] answers = { 1,3,2,4,2 };
		int[] chkPerson = new int[3];
		List<Integer> list = new ArrayList<>();
		int oneAns = 0;
		int twoAns = 0;
		int threeAns = 0;

		int max = chkPerson[0];
		for (int i = 0; i < answers.length; i++) {
			oneAns++;
			if (i % 5 == 0) {
				oneAns = 1;
			}

			if (i % 2 == 0) {
				chkPerson[1] = answers[i] == 2 ? chkPerson[1] + 1 : chkPerson[1];
			} else {
				if (twoAns == 3) {
					chkPerson[1] = answers[i] == 5 ? chkPerson[1] + 1 : chkPerson[1];
					twoAns = 0;
				} else if (twoAns == 0) {
					chkPerson[1] = answers[i] == 1 ? chkPerson[1] + 1 : chkPerson[1];

				} else if (twoAns == 1) {
					chkPerson[1] = answers[i] == 3 ? chkPerson[1] + 1 : chkPerson[1];

				} else if (twoAns == 2) {
					chkPerson[1] = answers[i] == 4 ? chkPerson[1] + 1 : chkPerson[1];
				}
				twoAns++;
			}
			threeAns = i % 8;
			chkPerson[0] = answers[i] == oneAns ? chkPerson[0] + 1 : chkPerson[0];
			if (threeAns == 0 || threeAns == 1) {
				chkPerson[2] = answers[i] == 3 ? chkPerson[2] + 1 : chkPerson[2];
			} else if (threeAns == 2 || threeAns == 3) {
				chkPerson[2] = answers[i] == 1 ? chkPerson[2] + 1 : chkPerson[2];
			} else if (threeAns == 4 || threeAns == 5) {
				chkPerson[2] = answers[i] == 2 ? chkPerson[2] + 1 : chkPerson[2];
			} else if (threeAns == 6 || threeAns == 7) {
				chkPerson[2] = answers[i] == 4 ? chkPerson[2] + 1 : chkPerson[2];
			} else if (threeAns == 8 || threeAns == 9) {
				chkPerson[2] = answers[i] == 5 ? chkPerson[2] + 1 : chkPerson[2];
			}
			for (int z = 0; z < chkPerson.length; z++) {
				if (max < chkPerson[z]) {
					max = chkPerson[z];
				}
			}

		}

		for (int i = 0; i < chkPerson.length; i++) {
			if (max == chkPerson[i])
				list.add(i + 1);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		for (int i : answer) {
			System.err.println(i);
		}

//		System.err.println(max);

	}
}
