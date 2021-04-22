
package programers.step1;

import java.util.ArrayList;
import java.util.List;

public class MinNumRemove_1_12935 {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 3 };
//		Integer[] tempArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//
//		
//		Arrays.sort(tempArr, Collections.reverseOrder());
//
//		int[] answer = null;
//
//		if (arr.length <= 1) {
//			answer = new int[1];
//			answer[0] = -1;
//		} else {
//			tempArr = Arrays.copyOfRange(tempArr, 0, tempArr.length - 1);
//			answer = new int[tempArr.length];
//			for(int i=0; i<tempArr.length; i++) {
//				answer[i] = tempArr[i].intValue();
//			}
//		}
//		

		int min = arr[0];
		int minIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				minIdx = i;

			}
		}

		List<Integer> temp = new ArrayList<>();
		int[] answer = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr.length <= 1) {
				answer = new int[1];
				answer[0] = -1;
				break;
			} else {
				answer = new int[arr.length - 1];
				if (i != minIdx) {
					temp.add(arr[i]);
				}
			}
		}

		for (int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i).intValue();
		}
//		

		for (int i : answer) {
			System.err.println(i);
		}

	}
}
