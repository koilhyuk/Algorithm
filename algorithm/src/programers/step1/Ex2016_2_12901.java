package programers.step1;

public class Ex2016_2_12901 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		String answer = "";

		String[] month = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int[] monthDay = new int[12];
		boolean monthFlg = true;// 7월부터 홀짝 월의 끝일이 바뀜
		for (int i = 0; i < monthDay.length; i++) {
			monthFlg = (i <= 6 ? i % 2 == 0 : i % 2 == 1); // 29 2
			if (i == 1) {// 2월 윤달 29일까지
				monthDay[i] = 29;
				continue;
			}
			if (monthFlg) {// 7월부터 30, 31달이 바뀜
				monthDay[i] = 31;
			} else {
				monthDay[i] = 30;
			}
		} // 매달 끝 날짜 입력

//		9-1(일수 차이) = 8%7(나머지로 인덱스 요일 check) == 1 SAT
//		15-1(일수 차이) = 14%7(나머지로 인덱스 요일 check) == 0 FRI
//		2월 2일 (2-1)+(31) = 32%7= 4  TUE
		int totalDays = 0;
		// 당월 제외하고 일수를 더함.
		for (int i = 0; i < a - 1; i++) {
			totalDays += monthDay[i];
		}
		totalDays += b - 1;// 해당 일수 더함.

		answer = month[totalDays % 7];

		System.err.println(answer);
	}
}