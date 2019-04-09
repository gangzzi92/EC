import java.util.Scanner;

public class Quiz1 {

	String name;
	int korScore;
	int engScore;
	int mathScore;
	int korSum;
	int engSum;
	int mathSum;
	int totalSum;
	double korAvg;
	double engAvg;
	double mathAvg;
	double totalAvg;

	public void InputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수를 입력해주세요");
		String strCount = scan.nextLine();
		int count = Integer.parseInt(strCount);
		Quiz1[] data = new Quiz1[count];

		for (int i = 0; i < data.length; i++) {
			data[i] = new Quiz1();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.print("이름 : ");
			data[i].name = scan.nextLine();
			System.out.print("국어점수 : ");
			String korString = scan.nextLine();
			data[i].korScore = Integer.parseInt(korString);
			korSum = korSum + data[i].korScore;
			System.out.print("영어점수 : ");
			String engString = scan.nextLine();
			data[i].engScore = Integer.parseInt(engString);
			engSum = engSum + data[i].engScore;
			System.out.print("수학점수 : ");
			String mathString = scan.nextLine();
			data[i].mathScore = Integer.parseInt(mathString);
			mathSum = mathSum + data[i].mathScore;
		}
		korAvg = Math.round(((double)korSum / data.length * 10)) / 10.0;
		engAvg = Math.round(((double)engSum / data.length * 10)) / 10.0;
		mathAvg = Math.round(((double)mathSum / data.length * 10)) / 00.0;
		totalSum = korSum + engSum + mathSum;
		totalAvg = Math.round(((double)totalSum / (data.length * 3) * 10)) / 10.0;

		for (int i = 0; i < data.length; i++) {
			System.out.println("이름 : " + data[i].name);
			System.out.println(
					"국어점수 : " + data[i].korScore + ", 영어점수 : " + data[i].engScore + ", 수학점수 : " + data[i].mathScore);
		}
		System.out.println("국어총점 : " + korSum + ", 영어총점 : " + engSum + ", 수학총점 : " + mathSum);
		System.out.println("국어평균 : " + korAvg + ", 영어평균 : " + engAvg + ", 수학평균 : " + mathAvg);
		System.out.println("전체총점 : " + totalSum + ", 전체평균 : " + totalAvg);
	}
}
