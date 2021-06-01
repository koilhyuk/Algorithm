package algorithm.src.programers.step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KakaoFailureRate_1_42889 {
	public static void main(String[] args) {
		int N = 4;
//		int[] stages = { 4, 4, 4, 4, 4 };// [3,4,2,1,5]
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };// [3,4,2,1,5]
		int[][] numLen = new int[N + 1][2];
		double[] tempRate = new double[N];
		int[] answer = new int[N];

		Arrays.sort(stages);
		int tempCnt = 0;
		int tempLen = stages.length;
		int tempStage = stages[0];
		java.util.List<Integer> list = new ArrayList<>();
		Map<Integer, Double> rateMap = new HashMap<>();

//		1,2,2,2,3,3,4,6
		for (int i = 0; i < stages.length; i++) {
			if (tempStage == stages[i]) {
				tempCnt++;
				if (i == stages.length - 1) {// 마지막에 변화하지 않을 떄
					System.err.println("last");
					rateMap.put(stages[i - 1], (double) tempCnt / tempLen);
				}
			} else {
				rateMap.put(stages[i - 1], (double) tempCnt / tempLen);
				System.err.println(
						((double) tempCnt / tempLen) + " : " + tempCnt + " / " + tempLen + " : " + (stages[i - 1]));
				tempLen -= tempCnt;
				if (i == stages.length - 1 && stages[i] < N + 1) {// 마지막 값 넣어주기
					rateMap.put(stages[i], (double) tempCnt / tempLen);
				}
				tempCnt = 1;
			}
			tempStage = stages[i];
		}

		for (int i = 1; i < N + 1; i++) {
			if (rateMap.get(i) == null) {
				rateMap.put(i, 0.0);
			}
		}

		Iterator<Integer> keys = rateMap.keySet().iterator();
		while (keys.hasNext()) {

			Integer key = keys.next();
			if (!list.isEmpty()) {
				for (int i = 0; i < list.size(); i++) {
					System.err.println(rateMap.get(list.get(i)).compareTo((rateMap.get(key))));
					if (rateMap.get(list.get(i)).compareTo((rateMap.get(key))) == 1) {
						list.add(i, key);
						break;
					} else if (rateMap.get(list.get(i)).compareTo((rateMap.get(key))) == 0) {
//						System.err.println(key);
						list.add(i + 1, key);
						break;
					} else {
 
					}
				}
			} else {
				list.add(key);
			}
			System.err.println("---");
		}
		for (int f = 0; f < list.size(); f++) {
			System.err.println(list.get(f));
		}

//		list.add(0);
//		for (int i = 0; i < tempRate.length; i++) {
//			for (int j = i + 1; j < tempRate.length; j++) {
//				if (tempRate[i] < tempRate[j]) {
//					System.err.println(i + " / " + j);
//				}
//			}
//		}

//		for (double i : tempRate) {
//			System.err.println(i);
//		}

//		for (int i = 0; i < numLen.length; i++) {
//			for (int j = 0; j < numLen[0].length; j++) {
//				System.out.print(numLen[i][j]);
//			}
//			System.out.println();
//		}

	}
}