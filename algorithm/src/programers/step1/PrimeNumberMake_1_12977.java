package programers.step1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberMake_1_12977 {
	public static void main(String[] args) {
		int answer = -1;
		int[] nums = { 1, 2, 3, 4 };
		List<String> tempList = new ArrayList<String>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int z = j + 1; z < nums.length; z++) {
					tempList.add(nums[i] + nums[j] + nums[z] + "");
				}
			}
		}

		int non = 0;
		for (String s : tempList) {
			for (int i = 2; i < Integer.parseInt(s); i++) {
				if (Integer.parseInt(s) % i == 0) {
					non++;
					break;
				}
			}
		}
		answer = tempList.size() - non;

		System.err.println(answer);

	}
}
