import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��� �ּ���.");
		int a = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��� �ּ���.");
		int b = s.nextInt();
		int sum = a + b;
		System.out.printf("%d + %d = %d�Դϴ�.", a, b, sum);
	}
}