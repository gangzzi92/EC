import java.util.Scanner;

public class Pig {
	public int totalCoin = 0;

	public void input() {
		Scanner s = new Scanner(System.in);
		int inputCoin = 0;
		String inputMsg = "";
		totalCoin = totalCoin + inputCoin;
		while (true) {
			System.out.print("메시지를 입력해주세요.");
			inputMsg = s.next();
			if (inputMsg.equals("crash")) {
				break;
			} else if (inputMsg.equals("")) {
				inputMsg = "딸그랑";
			}
			System.out.print("입금금액을 입력해주세요.");
			inputCoin = s.nextInt();
			totalCoin = totalCoin + inputCoin;
			System.out.println(inputMsg + "  입금금액 : " + inputCoin);
		}
		System.out.println("출금금액 : " + totalCoin);
	}
}
