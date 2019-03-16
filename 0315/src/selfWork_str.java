import java.util.Random;
import java.util.Scanner;

public class selfWork_str {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("¹¬! Âî! ºü!");

		String user = s.nextLine();
		String userBef = "";

		int com = r.nextInt(3);
		String comStr = "";
		int comBef = 0;
		if (com == 0) {
			comStr = "¹¬";
		} else if (com == 1) {
			comStr = "Âî";
		} else {
			comStr = "ºü";
		}
		while ((!user.equals("¹¬")) && (!user.equals("Âî")) && (!user.equals("ºü"))) {
			System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù.");
			user = s.nextLine();
		}
//Ã³À½¿¡ ºñ±ä°æ¿ì
		while (user.equals(comStr)) {
			System.out.println("user : " + user + ", com : " + comStr);
			System.out.println("ºñ°å½À´Ï´Ù. ´Ù½Ã ³»¼¼¿ä.");
			user = s.nextLine();
			com = r.nextInt(3);
			if (com == 0) {
				comStr = "¹¬";
			} else if (com == 1) {
				comStr = "Âî";
			} else {
				comStr = "ºü";
			}
			while ((!user.equals("¹¬")) && (!user.equals("Âî")) && (!user.equals("ºü"))) {
				System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù.");
				user = s.nextLine();
			}

		}
//ÁøÇà
		while (!user.equals(comStr)) {
			if ((user.equals("¹¬") && com == 1) || (user.equals("Âî") && com == 2) || (user.equals("ºü") && com == 0)) {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("ÀÌ°å½À´Ï´Ù. °ø°ÝÇÏ¼¼¿ä.");
				userBef = user;
				comBef = com;
				user = s.nextLine();
				com = r.nextInt(3);
				if (com == 0) {
					comStr = "¹¬";
				} else if (com == 1) {
					comStr = "Âî";
				} else {
					comStr = "ºü";
				}
				while ((!user.equals("¹¬")) && (!user.equals("Âî")) && (!user.equals("ºü"))) {
					System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù.");
					user = s.nextLine();
				}
			} else {
				System.out.println("user : " + user + ", com : " + comStr);
				System.out.println("Á³½À´Ï´Ù. ¹æ¾îÇÏ¼¼¿ä.");
				userBef = user;
				comBef = com;
				user = s.nextLine();
				com = r.nextInt(3);
				if (com == 0) {
					comStr = "¹¬";
				} else if (com == 1) {
					comStr = "Âî";
				} else {
					comStr = "ºü";
				}
				while ((!user.equals("¹¬")) && (!user.equals("Âî")) && (!user.equals("ºü"))) {
					System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù.");
					user = s.nextLine();
				}

			}
		}
		if ((userBef.equals("¹¬") && comBef == 1) || (userBef.equals("Âî") && comBef == 2)
				|| (userBef.equals("ºü") && comBef == 0)) {
			System.out.println("user : " + user + ", com : " + comStr);
			System.out.println("½Â¸®!");
		} else {
			System.out.println("user : " + user + ", com : " + comStr);
			System.out.println("ÆÐ¹è!");
		}

	}
}
