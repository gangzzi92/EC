import java.util.Random;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("학생1의 국어점수를 입혁하세요.");
//		int score1 = s.nextInt();
//		System.out.println("학생2의 국어점수를 입혁하세요.");
//		int score2 = s.nextInt();
//		System.out.println("학생3의 국어점수를 입혁하세요.");
//		int score3 = s.nextInt();
//		System.out.println("학생1 : " + score1 + "점 , 학생2 : " + score2 + "점, 학생3 : " + score3 + "점");
//		int sum = score1 + score2 + score3;
//		double average = (double)sum / 3;
//		System.out.println("총점 : " + sum + "점, 평균 : " + average +"점");

//		int sum2 = 0;
//		int score = 0;
//		for (int i = 0; i < 3; i++) {
//			System.out.println("학생" + (i + 1) + "의 국어점수를 입력하세요.");
//			score = s.nextInt();
//			sum2 = sum2 + score;
//		}
//		System.out.println("총점 : " + sum2 + ", 평균 : " + ((double) sum2 / 3));

//		Random r = new Random();
//		int ranSum = 0;
//		for (int j = 0; j < 8; j++) {
//			int ranScore = r.nextInt(101);
//			System.out.println("입력된 점수 : " + ranScore);
//			ranSum = ranSum + ranScore;
//		}
//		System.out.println("총점 : " + ranSum + ", 평균 : " + ((double)ranSum / 3));
		
		int index = 0;
		int whSum = 0;
		while (index != 3) {
			System.out.println("학생" + (index + 1) + "의 국어점수를 입력하세요.");
			int whScore = s.nextInt();
			whSum = whSum + whScore;
			index ++;
		}
		System.out.println("총점 : " + whSum + ", 평균 : " + ((double)whSum / 3));
		
	}
}
