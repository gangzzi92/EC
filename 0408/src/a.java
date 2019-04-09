import java.util.Scanner;

public class a {
	int number1 = 0;
	int number2 = 0;

	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫");
		this.number1 = s.nextInt();
		System.out.println("둘");
		this.number2 = s.nextInt();
		
				
	}
	public void output() {
		System.out.println(this.number1 + ", " + this.number2);
	}
}
