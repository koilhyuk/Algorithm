package programers.step1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PopPlus_1 {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		Iterator<Integer> iter = set.iterator();

		int[] answer = new int[set.size()];

		int i =0;
		while (iter.hasNext()) {
			answer[i] = iter.next().intValue();
			i++;
		}

		for(int e : answer) {
			System.err.println(e);
		}
		
	}
}
//2,3,4,5,6,7