import java.util.Random;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String answer = "y";
		while (answer.equals("y")) {
			System.out.println("화면에 주사위를 굴릴까요?");
			while (!answer.equals("")) {
				System.out.print("Enter키를 눌러주세요.");
				answer = s.nextLine();
			}
			int user = r.nextInt(6) + 1;
			answer = "y";
			System.out.println(user);
			System.out.println("컴퓨터가 주사위를 굴립니다. 실행할까요?");
			while (!answer.equals("")) {
				System.out.print("Enter키를 눌러주세요.");
				answer = s.nextLine();
			}
			int com = r.nextInt(6) + 1;			
			System.out.println(com);
			if (user > com) {
				System.out.println("You Win!");
			} else if (com > user) {
				System.out.println("You Lose!");
			} else {
				System.out.println("Draw");
			}
			System.out.println("계속할까요? y or n");
			answer = s.nextLine();
		}
	}
}
