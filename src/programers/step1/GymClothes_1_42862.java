package programers.step1;

public class GymClothes_1_42862 {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 3 };
		int answer = 0;

		int[] list = new int[n];
		for (int i : reserve) {// 2벌 가지고 있는 사람 check
			list[i - 1]++;
		}
		for (int i : lost) {// 잃어버린 사람 check
			list[i - 1]--;
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] == 1) {// 2벌 일때
				if (i - 1 > -1 && list[i - 1] == -1) {// 앞 번호부터 조회하여 없으면 나눠준다.
					list[i - 1]++;
					list[i]--;
				} else if (i + 1 < list.length - 1 && list[i + 1] == -1) {// 앞 번호 사람을 안줬을 때 뒷 번호 조회하여 나눠준다.
					list[i + 1]++;
					list[i]--;
				}
			}

			if (i >= 1 && list[i - 1] >= 0) { // 체육복 처리 과정 끝낸 후 전 인덱스의 값을 확인하여 추가
				answer++;
			}
			if (i == list.length - 1 && list[list.length - 1] >= 0) {// 마지막 인덱스에서 자기 자신도 확인하는 과정
				answer++;
			}
//			if (list[i] >= 0) {
//				System.err.println(i);
//				answer += 1;
//			}
		}
		System.err.println(answer);
	}
}
