import java.util.Random;

public class homeWork2 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(6) + 1;
		System.out.println(num);
		switch (num) {
		case 1:
			System.out.println("멍멍");
			break;
		case 2:
			System.out.println("야옹");
			break;
		case 3:
			System.out.println(num);
			break;
		case 4:
			System.out.println(num);
			break;
		case 5:
			System.out.println(num);
			break;
		case 6:
			System.out.println(num);
			break;
		}
	}
}
