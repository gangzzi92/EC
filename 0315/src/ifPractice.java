import java.util.Random;
import java.util.Scanner;

public class ifPractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("���� ���� ���� �Է����ּ���.\n ����  = 0, ���� = 1, �� = 2");
		int user=3;
		int com = r.nextInt(3);
		String userResult = "��";

		while ((user != 0) && (user != 1) && (user != 2)) {
			user = s.nextInt();
			if (user == 0) {
				userResult = "����";
			} else if (user == 1) {
				userResult = "����";
			} else if (user == 2) {
				userResult = "��";
			} else {
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		System.out.println(userResult + "�� �½��ϴ�.");
		String comResult;
		if (com == 0) {
			comResult = "����";
		} else if (com == 1) {
			comResult = "����";
		} else {
			comResult = "��";
		}
		if ((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
			System.out.println("�����ϴ�.");
		} else if ((user == 0 && com == 2) || (user == 1 && com == 0) || (user == 2 && com == 1)) {
			System.out.println("�̰���ϴ�.");
		} else {
			System.out.println("�����ϴ�.");
		}

		System.out.println("��ǻ�ʹ� " + comResult + "�� �½��ϴ�.");
	}
}