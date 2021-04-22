package programers.step1;

import java.util.Stack;

public class SameNum_2_12906 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 3, 3, 0, 1, 1 };
//		int[] arr = { 4,4,4,3,3};
		Stack<Integer> stack = new Stack<>();
		for (int i : arr) {
			if (stack.size() == 0 || stack.peek() != i) {
				stack.add(i);
			}
		}
		int[] answer = new int[stack.size()];

		answer = stack.stream().mapToInt(Integer::intValue).toArray();
		for (int i : answer) {
			System.err.println(i);
		}
	}
}
