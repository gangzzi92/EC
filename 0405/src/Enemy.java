import java.util.Random;

public class Enemy {

	String name = "";
	int hp = 0;
	
	Enemy(String name, int hp){
		this.name = name;
		this.hp = hp;
	}

	public boolean status() {
		if (this.hp > 0) {
			return true;
		}
		return false;
	}

	public void attack() {
		Random random = new Random();
		int hitNumber = random.nextInt(7);
		if (hitNumber == 4) {
			hp = hp - 10;
			System.out.println(this.name + "이(가) 10의 데미지를 입었습니다.");
		} else {
			System.out.println(this.name + "이(가)이 회피했습니다.");
		}
	}
}