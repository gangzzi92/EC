import java.util.Random;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		double num = s.nextDouble();
		System.out.println("�Է��� ���� " + num + "�Դϴ�.");
		double na = num % 2;
		System.out.println("�������� " + na + "�Դϴ�.");
		if (na == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		Random r = new Random();
		int randomValue = r.nextInt(100);
		System.out.println("������ ���� " + randomValue);
		System.out.println("�������� " + (randomValue % 2));
	}
	
}
