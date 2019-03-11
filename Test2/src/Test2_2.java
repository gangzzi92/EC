import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int n1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int n2 = s.nextInt();
		System.out.print("첫번째 숫자 + 두번째 숫자 = ");
		System.out.println(n1 + n2);
		System.out.print("첫번째 숫자 + 10 = ");
		System.out.println(n1 + 10);

	}
}
