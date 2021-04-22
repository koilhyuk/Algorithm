package programers.step1;

public class SameNum_1_12906 {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] answer = null;
		int arrSize = 0;
		int idx = 0;
		String eqStr = "";
		for (int i = 0; i < arr.length; i++) {
			if (!eqStr.equals(String.valueOf(arr[i]))) {
				arrSize++;
				eqStr = String.valueOf(arr[i]);
			}
		}
		answer = new int[arrSize];
		eqStr = "";
		for (int i = 0; i < arr.length; i++) {
			if (!eqStr.equals(String.valueOf(arr[i]))) {
				eqStr = String.valueOf(arr[i]);
				answer[idx] = arr[i];
				idx++;
			}
		}

		System.err.println(answer);
	}

}
