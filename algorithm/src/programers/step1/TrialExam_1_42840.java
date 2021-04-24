package programers.step1;

import java.util.ArrayList;
import java.util.List;

public class TrialExam_1_42840 {

	public static void main(String[] args) {

		int[] answers = { 1, 2, 3, 4, 5 };

		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5, };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] tempArr = new int[3];
		int maxOk = 0;

		for (int i = 0; i < answers.length; i++) {
			tempArr[0] += (one[i % 5] == answers[i] ? 1 : 0);
			tempArr[1] += (two[i % 8] == answers[i] ? 1 : 0);
			tempArr[2] += (three[i % 10] == answers[i] ? 1 : 0);
			if (i == answers.length - 1) {
				for (int ok : tempArr) {
					if (maxOk < ok) {
						maxOk = ok;
					}
				}
			}
		}
		List<Integer> tempList = new ArrayList<>();
		for (int i = 0; i < tempArr.length; i++) {
			if (maxOk == tempArr[i]) {
				tempList.add(i+1);
			}
		}
		int[] answer = tempList.stream().mapToInt(Integer::intValue).toArray();

	}

}
