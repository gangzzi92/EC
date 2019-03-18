import java.util.Random;
import java.util.Scanner;

public class ifQuiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("가위 바위 보를 입력해주세요.");
		int com = r.nextInt(3);
		int userResult = 0;
		String user;

		//while ((user != "가위") && (user != "바위") && (user != "보")) {
			user = s.nextLine();
			if (user.equals("가위")) {
				userResult = 0;
			} else if (user.equals("바위")) {
				userResult = 1;
			} else if (user.equals("보")) {
				userResult = 2;
			} else {
				System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
		//}
		System.out.println(user + "를 냈습니다.");

		String comResult;
		if (com == 0) {
			comResult = "가위";
		} else if (com == 1) {
			comResult = "바위";
		} else {
			comResult = "보";
		}
		if ((userResult == 0 && com == 1) || (userResult == 1 && com == 2) || (userResult == 2 && com == 0)) {
			System.out.println("졌습니다.");
		} else if ((userResult == 0 && com == 2) || (userResult == 1 && com == 0) || (userResult == 2 && com == 1)) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("비겼습니다.");
		}

		System.out.println("컴퓨터는 " + comResult + "를 냈습니다.");
	}
}