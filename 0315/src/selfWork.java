import java.util.Random;
import java.util.Scanner;

public class selfWork {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("��, ��, ���� ������ .\n ��  = 0, �� = 1 , ��  = 2");
		int user = s.nextInt();
		int com = r.nextInt(3);
		int userBef = 0;
		int comBef = 0;
		String userStr = "";
		String comStr = "";
		while ((user != 0) && (user != 1) && (user != 2)) {
			System.out.println("��, ��, ���� �����մϴ�. \n ��  = 0, �� = 1 , ��  = 2");
			user = s.nextInt();
		}
//ó���� �����
		while (user == com) {
			System.out.println("user = " + user + ", com = " + com);
			System.out.println("�����ϴ�. �ٽ� ������. \n ��  = 0, �� = 1 , ��  = 2");
			System.out.println(com);
			user = s.nextInt();
			com = r.nextInt(3);
			while ((user != 0) && (user != 1) && (user != 2)) {
				System.out.println("��, ��, ���� �����մϴ�. \n ��  = 0, �� = 1 , ��  = 2");
				user = s.nextInt();
			}

		}
//
		while (user != com) {
			if ((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
				System.out.println("user = " + user + ", com = " + com);
				System.out.println("�̰���ϴ�. �����ϼ���. \n ��  = 0, �� = 1 , ��  = 2");
				userBef = user;
				comBef = com;
				user = s.nextInt();
				com = r.nextInt(3);
				while ((user != 0) && (user != 1) && (user != 2)) {
					System.out.println("��, ��, ���� �����մϴ�. \n ��  = 0, �� = 1 , ��  = 2");
					user = s.nextInt();
				}
			} else {
				System.out.println("user = " + user + ", com = " + com);
				System.out.println("�����ϴ�. ����ϼ���. \n ��  = 0, �� = 1 , ��  = 2");
				userBef = user;
				comBef = com;
				user = s.nextInt();
				com = r.nextInt(3);
				while ((user != 0) && (user != 1) && (user != 2)) {
					System.out.println("��, ��, ���� �����մϴ�. \n ��  = 0, �� = 1 , ��  = 2");
					user = s.nextInt();
				}

			}
		}
		if ((userBef == 0 && comBef == 1) || (userBef == 1 && comBef == 2) || (userBef == 2 && comBef == 0)) {
			System.out.println("�̰���ϴ�.");
			System.out.println(user + " " + userBef + " " + com + " " + comBef);
		} else {
			System.out.println("�����ϴ�.");
			System.out.println(user + " " + userBef + " " + com + " " + comBef);
		}

	}
}
