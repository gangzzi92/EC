import java.util.Arrays;
import java.util.Scanner;

public class ScoreProject {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] korScore = new int[10];
		int korSum = 0;
		double korAvg = 0;

		int[] mathScore = new int[10];
		int mathSum = 0;
		double mathAvg = 0;

		int[] englishScore = new int[10];
		int englishSum = 0;
		double englishAvg = 0;

		int[] personaltotal = new int[10];
		double[] personalavg = new double[10];

		String[] student = new String[10];

		for (int i = 0; i < 10; i++) {
			System.out.print("학생 " + (i + 1) + "의 이름을 입력하세요. ");
			String studentName = s.nextLine();
			student[i] = studentName;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(student[i] + "의 국어점수를 입력하세요. ");
			int userInput = s.nextInt();
			korScore[i] = userInput;
			korSum = korSum + userInput;
		}
		korAvg = (double) korSum / korScore.length;

		for (int i = 0; i < 10; i++) {
			System.out.print(student[i] + "의 수학점수를 입력하세요. ");
			int userInput = s.nextInt();
			mathScore[i] = userInput;
			mathSum = mathSum + userInput;
		}
		mathAvg = (double) mathSum / mathScore.length;

		for (int i = 0; i < 10; i++) {
			System.out.print(student[i] + "의 영어점수를 입력하세요. ");
			int userInput = s.nextInt();
			englishScore[i] = userInput;
			englishSum = englishSum + userInput;
		}
		englishAvg = (double) englishSum / englishScore.length;

		for (int i = 0; i < 10; i++) {
			personaltotal[i] = korScore[i] + mathScore[i] + englishScore[i];
		}
		for (int i = 0; i < 10; i++) {
			personalavg[i] = (double) personaltotal[i] / 3;
		}
		int totalSum = 0;
		totalSum = korSum + mathSum + englishSum;
		double totalAvg = 0;
		totalAvg = (double) totalSum / 30;

		for (int i = 0; i < 10; i++) {
			System.out.println(
					student[i] + " 국어점수 : " + korScore[i] + ", 수학점수 : " + mathScore[i] + ", 영어점수 : " + englishScore[i]);
			System.out.println("총점 : " + personaltotal[i] + ", 평균 : " + personalavg[i]);
		}
		System.out.println("전체 국어 총점 : " + korSum + ", 전체 국어평균 : " + korAvg);
		System.out.println("전체 수학 총점 : " + mathSum + ", 전체 수학평균 : " + mathAvg);
		System.out.println("전체 영어 총점 : " + englishSum + ", 전체 영어평균 : " + englishAvg);
		System.out.println("전체  총점 : " + totalSum + ", 전체 평균 : " + totalAvg);
	}

}