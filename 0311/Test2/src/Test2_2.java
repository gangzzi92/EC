import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int n1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int n2 = s.nextInt();
		System.out.print("ù��° ���� + �ι�° ���� = ");
		System.out.println(n1 + n2);
		System.out.print("ù��° ���� + 10 = ");
		System.out.println(n1 + 10);
		System.out.printf("ù��° ���� + �ι�° ���� = %d\n", n1 + n2);
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", n1, n2, n1 + n2);
	}
}
