import java.util.Scanner;

public class SumNumber {
	public void doSum() {
		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 : ");
		number1 = scan.nextInt();

		System.out.print("숫자 : ");
		number2 = scan.nextInt();

		Sum2 s2 = new Sum2();
		int result = s2.sumNumbers(number1, number2);
		System.out.println("두개의 숫자의 합은 " + result + "입니다.");
	}

	public void hello() {
		System.out.println("Hello Java");
	}
}
