import java.util.Arrays;
import java.util.Scanner;

public class scoreProject2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String[][] ScoreBoard = new String[10][6];
		String userInput = "";
		int personalSum = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					System.out.println("이름을 입력하세요");
					userInput = s.nextLine();
					ScoreBoard[i][j] = userInput;
				} else if (j == 1) {
					System.out.println("국어점수를 입력하세요");
					userInput = s.nextLine();
					ScoreBoard[i][j] = userInput;
				} else if (j == 2) {
					System.out.println("수학점수를 입력하세요");
					userInput = s.nextLine();
					ScoreBoard[i][j] = userInput;
				} else if (j == 3) {
					System.out.println("영어점수를 입력하세요");
					userInput = s.nextLine();
					ScoreBoard[i][j] = userInput;
				} else if (j == 4) {
					System.out.println("영어점수를 입력하세요");
					userInput = s.nextLine();
					ScoreBoard[i][j] = userInput;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ScoreBoard[i][j] + "  ");
			}
			System.out.println("");
		}
	}
}
