package programers.step1;

public class SecretMap_1_17681 {
	public static void main(String[] args) {
// binary의 | 계산하라는 의도를 갖은 문제 같음
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
//		출력	["#####","# # #", "### #", "# ##", "#####"]
		
		String binary1 = "";
		String binary2 = "";
		String[] answer = new String[n];
		String tmpStr = "";
		for (int i = 0; i < n; i++) {
			binary1 = String.format("%" + n + "s", Integer.toBinaryString(arr1[i]));
			binary2 = String.format("%" + n + "s", Integer.toBinaryString(arr2[i]));
			tmpStr = "";
			for (int j = 0; j < n; j++) {
				if (binary1.charAt(j) == '1' || binary2.charAt(j) == '1') {
					tmpStr += "#";
				} else {
					tmpStr += " ";
				}
			}
			answer[i] = tmpStr;
		}

		for (String s : answer) {
			System.err.println(s);
		}
	}
}
