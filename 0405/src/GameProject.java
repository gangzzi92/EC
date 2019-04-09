import java.util.Scanner;

public class GameProject {
	public static void main(String[] args) {
		Player player = new Player("김갱", 100);
		Enemy[] enemy = new Enemy[5];
		enemy[0] = new Enemy("자바", 100);
		enemy[1] = new Enemy("자바1", 110);
		enemy[2] = new Enemy("자바2", 120);
		enemy[3] = new Enemy("자바3", 130);
		enemy[4] = new Enemy("자바4", 140);

		Scanner scan = new Scanner(System.in);
		System.out.println("턴 진행은 엔터를 입력하세요.");
		for (int i = 0; i < 10000; i++) {
			scan.nextLine();

			for (int j = 0; j < enemy.length; j++) {

				if (enemy[j].status()) {
					enemy[j].attack();
				}
			}
			boolean nonDefeat = false;
			for (int j = 0; j < enemy.length; j++) {

				if (enemy[j].status()) {
					nonDefeat = true;

				}
			}
			if (!nonDefeat) {
				System.out.println("적이 파괴되었습니다. 플레이어가 승리했습니다.");
				break;
			}
			player.attack();
			if (player.status()) {

			} else {
				System.out.println("플레이어가 파괴되었습니다. 플레이어가 패배했습니다.");
				break;
			}

		}
	}
}