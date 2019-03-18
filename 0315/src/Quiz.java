import java.util.Random;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		double num = s.nextDouble();
		System.out.println("입력한 값은 " + num + "입니다.");
		double na = num % 2;
		System.out.println("나머지는 " + na + "입니다.");
		if (na == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		Random r = new Random();
		int randomValue = r.nextInt(100);
		System.out.println("임의의 값은 " + randomValue);
		System.out.println("나머지는 " + (randomValue % 2));
	}
	
}
