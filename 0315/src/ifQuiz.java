import java.util.Random;
import java.util.Scanner;

public class ifQuiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("���� ���� ���� �Է����ּ���.");
		int com = r.nextInt(3);
		int userResult = 0;
		String user;

		//while ((user != "����") && (user != "����") && (user != "��")) {
			user = s.nextLine();
			if (user.equals("����")) {
				userResult = 0;
			} else if (user.equals("����")) {
				userResult = 1;
			} else if (user.equals("��")) {
				userResult = 2;
			} else {
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}
		//}
		System.out.println(user + "�� �½��ϴ�.");

		String comResult;
		if (com == 0) {
			comResult = "����";
		} else if (com == 1) {
			comResult = "����";
		} else {
			comResult = "��";
		}
		if ((userResult == 0 && com == 1) || (userResult == 1 && com == 2) || (userResult == 2 && com == 0)) {
			System.out.println("�����ϴ�.");
		} else if ((userResult == 0 && com == 2) || (userResult == 1 && com == 0) || (userResult == 2 && com == 1)) {
			System.out.println("�̰���ϴ�.");
		} else {
			System.out.println("�����ϴ�.");
		}

		System.out.println("��ǻ�ʹ� " + comResult + "�� �½��ϴ�.");
	}
}