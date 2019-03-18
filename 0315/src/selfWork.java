import java.util.Random;
import java.util.Scanner;

public class selfWork {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("묵, 찌, 빠를 고르세요 .\n 묵  = 0, 찌 = 1 , 빠  = 2");
		int user = s.nextInt();
		int com = r.nextInt(3);
		int userBef = 0;
		int comBef = 0;
		String userStr = "";
		String comStr = "";
		while ((user != 0) && (user != 1) && (user != 2)) {
			System.out.println("묵, 찌, 빠만 가능합니다. \n 묵  = 0, 찌 = 1 , 빠  = 2");
			user = s.nextInt();
		}
//처음에 비긴경우
		while (user == com) {
			System.out.println("user = " + user + ", com = " + com);
			System.out.println("비겼습니다. 다시 내세요. \n 묵  = 0, 찌 = 1 , 빠  = 2");
			System.out.println(com);
			user = s.nextInt();
			com = r.nextInt(3);
			while ((user != 0) && (user != 1) && (user != 2)) {
				System.out.println("묵, 찌, 빠만 가능합니다. \n 묵  = 0, 찌 = 1 , 빠  = 2");
				user = s.nextInt();
			}

		}
//
		while (user != com) {
			if ((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
				System.out.println("user = " + user + ", com = " + com);
				System.out.println("이겼습니다. 공격하세요. \n 묵  = 0, 찌 = 1 , 빠  = 2");
				userBef = user;
				comBef = com;
				user = s.nextInt();
				com = r.nextInt(3);
				while ((user != 0) && (user != 1) && (user != 2)) {
					System.out.println("묵, 찌, 빠만 가능합니다. \n 묵  = 0, 찌 = 1 , 빠  = 2");
					user = s.nextInt();
				}
			} else {
				System.out.println("user = " + user + ", com = " + com);
				System.out.println("졌습니다. 방어하세요. \n 묵  = 0, 찌 = 1 , 빠  = 2");
				userBef = user;
				comBef = com;
				user = s.nextInt();
				com = r.nextInt(3);
				while ((user != 0) && (user != 1) && (user != 2)) {
					System.out.println("묵, 찌, 빠만 가능합니다. \n 묵  = 0, 찌 = 1 , 빠  = 2");
					user = s.nextInt();
				}

			}
		}
		if ((userBef == 0 && comBef == 1) || (userBef == 1 && comBef == 2) || (userBef == 2 && comBef == 0)) {
			System.out.println("이겼습니다.");
			System.out.println(user + " " + userBef + " " + com + " " + comBef);
		} else {
			System.out.println("졌습니다.");
			System.out.println(user + " " + userBef + " " + com + " " + comBef);
		}

	}
}
