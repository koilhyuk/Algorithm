package programers.step1;

public class Average_1_12944 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int arr_len = arr.length;
		double answer = 0;

		double temp = 0;
		for (int i = 0; i < arr_len; i++) {
			temp += arr[i];

		}
		answer = temp / arr_len;

//		return answer;
		System.err.println(answer);

	}
}
