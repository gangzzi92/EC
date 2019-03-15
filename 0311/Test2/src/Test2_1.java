import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요.");
		int a = s.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int b = s.nextInt();
		int sum = a + b;
		System.out.printf("%d + %d = %d입니다.", a, b, sum);
	}
}