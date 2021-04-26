package programers.step1;

import java.util.HashSet;
import java.util.Set;

public class Poketmon_1_1845 {
	public static void main(String[] args) {

		int[] nums = { 3, 3, 3, 2, 2, 2 };
		int answer = 0;

		int popNum = nums.length / 2;
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}
		answer = (set.size() >= popNum ? popNum : set.size());

		System.err.println(answer);

	}

}
// python
//popNum=int(len(nums)/2)
//tempSet=set(nums)
//setLen=int(len(tempSet))
//if setLen>=popNum:answer=popNum else:
//	answer= setLen 
//print(answer)
