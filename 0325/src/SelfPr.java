import java.util.Arrays;
import java.util.Scanner;

public class SelfPr {
	public static void main(String[] args) {
		System.out.println("학생수를 입력해주세요.");
		Scanner s = new Scanner(System.in);
		int studentNumber = s.nextInt();
		String[][] report = new String[studentNumber + 3][6];
		int[] personalSum = new int[studentNumber];
		double[] personalAvg = new double[studentNumber];
		report[0][0] = "이름";
		report[0][1] = "국어점수";
		report[0][2] = "수학점수";
		report[0][3] = "영어점수";
		report[0][4] = "총점";
		report[0][5] = "평균";
		report[studentNumber + 1][5] = " ";
		report[studentNumber + 2][5] = " ";
		report[studentNumber + 1][0] = "총점";
		report[studentNumber + 2][0] = "평균";
		int korSum = 0;
		double korAvg = 0;
		int mathSum = 0;
		double mathAvg = 0;
		int engSum = 0;
		double engAvg = 0;

		s.nextLine();
		String input = "";
		for (int i = 1; i <= studentNumber; i++) {
			System.out.print("학생이름을 입력해주세요. ");
			input = s.nextLine();
			report[i][0] = input;
		}
		int inputNumber = 0;
		for (int i = 1; i <= studentNumber; i++) {
			System.out.print(report[i][0] + "의 국어점수를 입력해주세요. ");
			inputNumber = s.nextInt();
			report[i][1] = String.valueOf(inputNumber);
			korSum = korSum + inputNumber;
			personalSum[i - 1] = personalSum[i - 1] + inputNumber;
		}
		report[studentNumber + 1][1] = String.valueOf(korSum);
		korAvg = Math.round((((double) korSum / studentNumber) * 10)) / 10.0;
		report[studentNumber + 2][1] = String.valueOf(korAvg);

		for (int i = 1; i <= studentNumber; i++) {
			System.out.print(report[i][0] + "의 수학점수를 입력해주세요. ");
			inputNumber = s.nextInt();
			report[i][2] = String.valueOf(inputNumber);
			mathSum = mathSum + inputNumber;
			personalSum[i - 1] = personalSum[i - 1] + inputNumber;
		}
		report[studentNumber + 1][2] = String.valueOf(mathSum);
		mathAvg = Math.round(((double) mathSum / studentNumber) * 10) / 10.0;
		report[studentNumber + 2][2] = String.valueOf(mathAvg);

		for (int i = 1; i <= studentNumber; i++) {
			System.out.print(report[i][0] + "의 영어점수를 입력해주세요. ");
			inputNumber = s.nextInt();
			report[i][3] = String.valueOf(inputNumber);
			engSum = engSum + inputNumber;
			personalSum[i - 1] = personalSum[i - 1] + inputNumber;
		}
		report[studentNumber + 1][3] = String.valueOf(engSum);
		engAvg = Math.round(((double) engSum / studentNumber) * 10) / 10.0;
		report[studentNumber + 2][3] = String.valueOf(engAvg);

		for (int i = 0; i < studentNumber; i++) {
			report[i + 1][4] = String.valueOf(personalSum[i]);
			personalAvg[i] = Math.round(((double) personalSum[i] / 3) * 10) / 10.0;
			report[i + 1][5] = String.valueOf(personalAvg[i]);
		}
		report[studentNumber + 1][4] = String.valueOf(korSum + mathSum + engSum);
		report[studentNumber + 2][4] = String
				.valueOf(Math.round(((double) (korSum + mathSum + engSum)) / (studentNumber * 3) * 10) / 10.0);
		for (int i = 0; i < studentNumber + 3; i++) {
			System.out.println(Arrays.toString(report[i]));
		}
	}
}