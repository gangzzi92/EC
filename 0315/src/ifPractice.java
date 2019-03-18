import java.util.Random;
import java.util.Scanner;

public class ifPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("가위 바위 보를 입력해주세요.\n 가위  = 0, 바위 = 1, 보 = 2");
		int user=3;
		int com = r.nextInt(3);
		String userResult = "으";

		while ((user != 0) && (user != 1) && (user != 2)) {
			user = s.nextInt();
			if (user == 0) {
				userResult = "가위";
			} else if (user == 1) {
				userResult = "바위";
			} else if (user == 2) {
				userResult = "보";
			} else {
				System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
		}
		System.out.println(userResult + "를 냈습니다.");
		String comResult;
		if (com == 0) {
			comResult = "가위";
		} else if (com == 1) {
			comResult = "바위";
		} else {
			comResult = "보";
		}
		if ((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
			System.out.println("졌습니다.");
		} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}

		System.out.println("컴퓨터는 " + comResult + "를 냈습니다.");
	}
}