import java.util.Random;
import java.util.Scanner;

public class selfWork_str {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		Random r = new Random();
		String answer = "y";
		String anStor = "";
		while (answer.equals("y")) {
			System.out.println("묵! 찌! 빠!");

			String user = s.nextLine();
			String userBef = "";

			int com = r.nextInt(3);
			String comStr = "";
			int comBef = 0;
			if (com == 0) {
				comStr = "묵";
			} else if (com == 1) {
				comStr = "찌";
			} else {
				comStr = "빠";
			}

			while ((!user.equals("묵")) && (!user.equals("찌")) && (!user.equals("빠"))) {
				System.out.println("묵, 찌, 빠만 가능합니다.");
				user = s.nextLine();
			}
//처음에 비긴경우
			while (user.equals(comStr)) {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("비겼습니다. 다시 내세요.");
				user = s.nextLine();
				com = r.nextInt(3);
				if (com == 0) {
					comStr = "묵";
				} else if (com == 1) {
					comStr = "찌";
				} else {
					comStr = "빠";
				}
				while ((!user.equals("묵")) && (!user.equals("찌")) && (!user.equals("빠"))) {
					System.out.println("묵, 찌, 빠만 가능합니다.");
					user = s.nextLine();
				}

			}
//진행
			while (!user.equals(comStr)) {
				if ((user.equals("묵") && com == 1) || (user.equals("찌") && com == 2)
						|| (user.equals("빠") && com == 0)) {
					System.out.println("user : " + user + ", com : " + comStr);
					System.out.println("이겼습니다. 공격하세요.");
					userBef = user;
					comBef = com;
					user = s.nextLine();
					com = r.nextInt(3);
					if (com == 0) {
						comStr = "묵";
					} else if (com == 1) {
						comStr = "찌";
					} else {
						comStr = "빠";
					}
					while ((!user.equals("묵")) && (!user.equals("찌")) && (!user.equals("빠"))) {
						System.out.println("묵, 찌, 빠만 가능합니다.");
						user = s.nextLine();
					}
				} else {
					System.out.println("user : " + user + ", com : " + comStr);
					System.out.println("졌습니다. 방어하세요.");
					userBef = user;
					comBef = com;
					user = s.nextLine();
					com = r.nextInt(3);
					if (com == 0) {
						comStr = "묵";
					} else if (com == 1) {
						comStr = "찌";
					} else {
						comStr = "빠";
					}
					while ((!user.equals("묵")) && (!user.equals("찌")) && (!user.equals("빠"))) {
						System.out.println("묵, 찌, 빠만 가능합니다.");
						user = s.nextLine();
					}

				}
			}
			if ((userBef.equals("묵") && comBef == 1) || (userBef.equals("찌") && comBef == 2)
					|| (userBef.equals("빠") && comBef == 0)) {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("승리!");
			} else {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("패배!");
			}
			System.out.println("계속 하시겠습니까? y or n");
			anStor = an.nextLine();
			while ((!anStor.equals("y")) && (!anStor.equals("n"))) {
				System.out.println("y 나 n으로  입력해주세요");
				anStor = an.nextLine();
			}
			answer = anStor;
		}
	}
}
