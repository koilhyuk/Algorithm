package programers.step1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestPop {
	public static void main(String[] args) {

		
		int[] numbers = { 5, 0, 2, 7 };
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		int[] answer = new int[set.size()];
		Integer[] tempAns = new Integer[set.size()];
		set.toArray(tempAns);
		
		answer = Arrays.stream(tempAns).mapToInt(Integer::intValue).toArray();
		
		
		
		
		
	}
}
