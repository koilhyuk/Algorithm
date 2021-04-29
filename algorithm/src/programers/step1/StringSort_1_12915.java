package programers.step1;

public class StringSort_1_12915 {

	public static void main(String[] args) {
		String[] strings = { "abce", "abcd", "cdx", "abz", "cf" };
//		String[] strings   = { "sun", "bed", "car" };
		int n = 1;
		int idx = n;
		boolean firstFlag = false; // 첫 비교할 때 값이 같을 때 flag
		String tempStr = "";
		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				tempStr = "";
				if (strings[i].charAt(idx) > strings[j].charAt(idx)) {
					tempStr = strings[i];
					strings[i] = strings[j];
					strings[j] = tempStr;
					idx = n;// 같은 값일 때 증가 시켜서 다시 값 초기화
					firstFlag = false;
				} else if (strings[i].charAt(idx) == strings[j].charAt(idx)) {
					if (!firstFlag) {
						idx = 0;
						firstFlag = true;
					} else {
						idx++;
					}
					j -= 1;
				} else {
					idx = n;
					firstFlag = false;
				}
			} // end for
		} // end for

		for (String s : strings) {
			System.err.println(s);
		}
	}
}
