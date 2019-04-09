import java.util.Scanner;

public class StudentRunClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] sArray = new Student[10];
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = new Student();
			System.out.println("" + (i + 1) + "번째 학생 데이터 입력");
			System.out.print("이름 : ");
			sArray[i].name = scan.nextLine();
			System.out.print("국어점수 : ");
			String korString = scan.nextLine();
			sArray[i].korScore = Integer.parseInt(korString);
//			sArray[i].korScore = scan.nextInt();
			System.out.print("영어점수 : ");
			String engString = scan.nextLine();
			sArray[i].engScore = Integer.parseInt(engString);
//			sArray[i].engScore = scan.nextInt();
			System.out.print("수학점수 : ");
			String mathString = scan.nextLine();
			sArray[i].mathScore = Integer.parseInt(mathString);
//			sArray[i].mathScore = scan.nextInt();
		}

	}
}
