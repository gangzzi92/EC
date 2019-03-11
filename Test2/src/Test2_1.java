import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		System.out.println("화면에 숫자를 입력해 주세요!");
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.println(n1);
		
		System.out.println("화면에 숫자를 또 입력해 주세요!");
		int n2 = s.nextInt();
		System.out.print("입력한 숫자는 ");
		System.out.println(n2);
	}
}
