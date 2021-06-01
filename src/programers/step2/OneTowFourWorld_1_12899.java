package programers.step2;

import java.util.HashMap;
import java.util.Map;

public class OneTowFourWorld_1_12899 {
	/**
	 * 
	 * 생각 정리 
	 * 
	 * 1 4 7 10 13 앞 번호를 구하고 뒤에 두 수를 2씩 더하여 구해준다.
	 * 뒷 자리는 처음 나눈 나머지 값 나머지가 3보다 크다면 또 3으로 나눈 나머지 값으로 배치
	 * 맨 앞자리는 생각중......
	 * @param args
	 */
	public static void main(String[] args) {
//		1	1   2  2   3  4	
//		4	11  5  12  6  14
//		7	21  8  22  9  24
//		10	41  11 42  12 44
//		13  111 14 112 15 114
//		16  121 17 122 18 124
//		19  141 20 142 21 144
//		22  211 23 212 24 214 25 26 27 28 29 30 
//		31 32 33  34 35 36  37 38 39

		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 4);
		map.put(1, 1);
		map.put(2, 2);

		int n = 10;
		String temp = "";
//		System.err.println(n % 3 + " / " + );

		int nam = n % 3;
		temp = map.get(nam) + temp;
		int mok = (n - (nam)) / 3;

		if (mok > 3) {
			temp = map.get(mok % 3) + temp;
		}else {
//			(mok-1)
		}

		System.err.println(temp);
		int asnwer = 0;

	}
}
