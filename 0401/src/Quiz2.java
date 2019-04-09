import java.util.Scanner;

public class Quiz2 {
	String name;
	int midScore;
	int finScore;
	int midSum;
	int finSum;
	int totalSum;
	double midAvg;
	double finAvg;
	double totalAvg;

	public void Grade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생수를 입력해주세요");
		String strCount = scan.nextLine();
		int count = Integer.parseInt(strCount);
		Quiz2[] data = new Quiz2[count];

		for (int i = 0; i < count; i++) {
			data[i] = new Quiz2();
			System.out.println((i + 1) + "번째 학생이름을 입력해주세요.");
			data[i].name = scan.nextLine();
			
			String tmp;
			System.out.println(data[i].name + "의 중간고사 점수를 입력해 주세요.");
			tmp = scan.nextLine();
			data[i].midScore = Integer.parseInt(tmp);
			this.midSum = this.midSum + data[i].midScore;
			System.out.println(data[i].name + "의 기말고사 점수를 입력해 주세요.");
			tmp = scan.nextLine();
			data[i].finScore = Integer.parseInt(tmp);
			this.finSum = this.finSum + data[i].finScore;
		}
		this.totalSum = this.midSum + this.finSum;
		System.out.println(data);
	}
}
