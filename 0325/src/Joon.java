import java.util.Scanner;

public class Joon {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for (int i = 0; i < number; i++) {
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int r1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			int r2 = s.nextInt();
			if (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) == r1 + r2) {
				System.out.println(1);
			} else if (Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))) < r1 + r2) {
				if ((x1 == x2) && (y1 == y2)) {
					if (r1 == r2) {
						System.out.println(-1);
					} else {
						System.out.println(0);
					}
				} else {
					System.out.println(2);
				}
			} else if (Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))) > r1 + r2) {
				System.out.println(0);
			} else {
				System.out.println(-1);
			}
		}
	}
}
