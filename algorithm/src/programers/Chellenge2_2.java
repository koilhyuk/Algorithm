package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chellenge2_2 {
	public static void main(String[] args) {

		String s = "[](){}";
//		String s = "{([])}";
//		String s = "[](){}";
//		String s="}]()[{";
//		String s="[)(]";
//		String s="}}}";
		Map<String, String> map = new HashMap<>();
		map.put("[", "]");
		map.put("(", ")");
		map.put("{", "}");

//		map.put("]", "[");
//		map.put(")", "(");
//		map.put("}", "{");

		int answer = -1;

		List<String> tempList = new ArrayList<String>(Arrays.asList(s.split("")));
//
//		for (int i = 0; i < tempList.size(); i++) {
//			tempList.add(tempList.get(0));
//			tempList.remove(0);
//			System.err.println("o");
//			break;
//		}
		for (int i = 0; i < s.length(); i++) {
			if (map.get(tempList.get(i)) == null) {// 닫기부터 시작일 때 break
				tempList.add(tempList.get(0));
				tempList.remove(0);
//				i=-1;
//				continue;
			}
			System.err.println(i);
		}
//
//		for (int i = 0; i < tempList.size(); i++) {
//			System.err.println(tempList.get(i));
//
//		}

//		System.out.println(answer);
	}

}
