package programers.step1;

public class DenominatorMultiple_1_12940 {
	public static void main(String[] args) {
		int n = 30;
		int m = 343;
		int[] answer = { 1, 1 };
		DenominatorMultiple_1_12940 obj = new DenominatorMultiple_1_12940();
		obj.makeDenoMul(n, m, answer);
		System.err.println(answer[0]);
		System.err.println(answer[1]);
	}

	public int makeMok(int val, int division) {
		return (val - (val % division)) / division;
	}

	public int[] makeDenoMul(int n, int m, int[] answer) {
		int maxDiv = n > m ? m : n;
		boolean divFlag = true;
		while (divFlag) {
			for (int i = 2; i <= maxDiv; i++) {
				if (n % i == 0 && m % i == 0) {
					answer[0] *= i;
					n = makeMok(n, i);
					m = makeMok(m, i);
					maxDiv = n > m ? m : n;
					break;
				} else {
					divFlag = false;
				}
			}
			answer[1] = answer[0] * n * m;
		}
		return answer;
	}

}
