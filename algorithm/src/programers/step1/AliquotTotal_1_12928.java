package programers.step1;

public class AliquotTotal_1_12928 {
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		System.err.println(answer);
	}
}
// python solution
//def solution(n):
//    answer = sum([i for i in range(1, n+1) if not n % i])
//    return answer
