package programers.step1;

import java.util.ArrayList;
import java.util.List;

public class ClawMachine_1 {
	public static void main(String[] args) {
		int answer = 0;
		List<Integer> tmpArr = new ArrayList<Integer>();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
//		4, 3, 1, 1, 3, 2,4
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					if (tmpArr.size() == 0 || tmpArr.get(tmpArr.size() - 1) != board[j][moves[i] - 1]) {
						tmpArr.add(board[j][moves[i] - 1]);
					} else {
						answer += 2;
						tmpArr.remove(tmpArr.size() - 1);
					}
					board[j][moves[i] - 1] = 0;
					break;
				}
			}
		}

//		for (int i = 0; i < tmpArr.size(); i++) {
//			if ((i + 1) == tmpArr.size())
//				break;
//			if (tmpArr.get(i) == tmpArr.get(i + 1)) {
//				answer += 2;
//				tmpArr.remove(i + 1);
//				tmpArr.remove(i);
//				i = -1;
//			}
//			
//		}

		System.err.println(answer);

		for (int[] i : board) {
			for (int j : i) {
				System.err.print(j);
			}
			System.err.println();
		}

	}
}
