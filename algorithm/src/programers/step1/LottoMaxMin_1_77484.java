package programers.step1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class LottoMaxMin_1_77484 {
public static void main(String[] args) {
	
//	lottos	win_nums	result
//	[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
//	[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
//	[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
	int[] lottos = { 44, 1, 0, 0, 31, 25 };
	int[] win_nums = { 31, 10, 45, 1, 6, 19 };
	
	List<Integer> list = Arrays.asList(win_nums);   
	
	
	
	System.err.println(list.contains(11));

	
}	
	
}
