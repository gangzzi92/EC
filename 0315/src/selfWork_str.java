import java.util.Random;
import java.util.Scanner;

public class selfWork_str {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("��! ��! ��!");

		String user = s.nextLine();
		String userBef = "";

		int com = r.nextInt(3);
		String comStr = "";
		int comBef = 0;
		if (com == 0) {
			comStr = "��";
		} else if (com == 1) {
			comStr = "��";
		} else {
			comStr = "��";
		}
		while ((!user.equals("��")) && (!user.equals("��")) && (!user.equals("��"))) {
			System.out.println("��, ��, ���� �����մϴ�.");
			user = s.nextLine();
		}
//ó���� �����
		while (user.equals(comStr)) {
			System.out.println("user : " + user + ", com : " + comStr);
			System.out.println("�����ϴ�. �ٽ� ������.");
			user = s.nextLine();
			com = r.nextInt(3);
			if (com == 0) {
				comStr = "��";
			} else if (com == 1) {
				comStr = "��";
			} else {
				comStr = "��";
			}
			while ((!user.equals("��")) && (!user.equals("��")) && (!user.equals("��"))) {
				System.out.println("��, ��, ���� �����մϴ�.");
				user = s.nextLine();
			}

		}
//����
		while (!user.equals(comStr)) {
			if ((user.equals("��") && com == 1) || (user.equals("��") && com == 2) || (user.equals("��") && com == 0)) {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("�̰���ϴ�. �����ϼ���.");
				userBef = user;
				comBef = com;
				user = s.nextLine();
				com = r.nextInt(3);
				if (com == 0) {
					comStr = "��";
				} else if (com == 1) {
					comStr = "��";
				} else {
					comStr = "��";
				}
				while ((!user.equals("��")) && (!user.equals("��")) && (!user.equals("��"))) {
					System.out.println("��, ��, ���� �����մϴ�.");
					user = s.nextLine();
				}
			} else {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("�����ϴ�. ����ϼ���.");
				userBef = user;
				comBef = com;
				user = s.nextLine();
				com = r.nextInt(3);
				if (com == 0) {
					comStr = "��";
				} else if (com == 1) {
					comStr = "��";
				} else {
					comStr = "��";
				}
				while ((!user.equals("��")) && (!user.equals("��")) && (!user.equals("��"))) {
					System.out.println("��, ��, ���� �����մϴ�.");
					user = s.nextLine();
				}

			}
		}
		if ((userBef.equals("��") && comBef == 1) || (userBef.equals("��") && comBef == 2)
				|| (userBef.equals("��") && comBef == 0)) {
			System.out.println("user : " + user + ", com : " + comStr);
			System.out.println("�¸�!");
		} else {
			System.out.println("user : " + user + ", com : " + comStr);
			System.out.println("�й�!");
		}

	}
}
