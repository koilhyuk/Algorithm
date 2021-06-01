package programers.step1;

public class SecretMap_2_17681 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
//		출력	["#####","# # #", "### #", "# ##", "#####"]

		String binary = "";
		String[] answer = new String[n];

		String tmpStr = "";
		for (int i = 0; i < n; i++) {
			tmpStr = "";
			binary = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
			for (int j = 0; j < n; j++) {
				if (binary.charAt(j) == '1') {
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
