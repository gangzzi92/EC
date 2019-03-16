import java.util.Random;
import java.util.Scanner;

public class selfWork {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.println("¹¬, Âî, ºü¸¦ °í¸£¼¼¿ä .\n ¹¬  = 0, Âî = 1 , ºü  = 2");
		int user = s.nextInt();
		int com = r.nextInt(3);
		int userBef = 0;
		int comBef = 0;
		String userStr = "";
		String comStr = "";
		while ((user != 0) && (user != 1) && (user != 2)) {
			System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
			user = s.nextInt();
		}
//Ã³À½¿¡ ºñ±ä°æ¿ì
		while (user == com) {
			System.out.println("user = " + user + ", com = " + com);
			System.out.println("ºñ°å½À´Ï´Ù. ´Ù½Ã ³»¼¼¿ä. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
			System.out.println(com);
			user = s.nextInt();
			com = r.nextInt(3);
			while ((user != 0) && (user != 1) && (user != 2)) {
				System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
				user = s.nextInt();
			}

		}
//
		while (user != com) {
			if ((user == 0 && com == 1) || (user == 1 && com == 2) || (user == 2 && com == 0)) {
				System.out.println("user = " + user + ", com = " + com);
				System.out.println("ÀÌ°å½À´Ï´Ù. °ø°ÝÇÏ¼¼¿ä. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
				userBef = user;
				comBef = com;
				user = s.nextInt();
				com = r.nextInt(3);
				while ((user != 0) && (user != 1) && (user != 2)) {
					System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
					user = s.nextInt();
				}
			} else {
				System.out.println("user = " + user + ", com = " + com);
				System.out.println("Á³½À´Ï´Ù. ¹æ¾îÇÏ¼¼¿ä. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
				userBef = user;
				comBef = com;
				user = s.nextInt();
				com = r.nextInt(3);
				while ((user != 0) && (user != 1) && (user != 2)) {
					System.out.println("¹¬, Âî, ºü¸¸ °¡´ÉÇÕ´Ï´Ù. \n ¹¬  = 0, Âî = 1 , ºü  = 2");
					user = s.nextInt();
				}

			}
		}
		if ((userBef == 0 && comBef == 1) || (userBef == 1 && comBef == 2) || (userBef == 2 && comBef == 0)) {
			System.out.println("ÀÌ°å½À´Ï´Ù.");
			System.out.println(user + " " + userBef + " " + com + " " + comBef);
		} else {
			System.out.println("Á³½À´Ï´Ù.");
			System.out.println(user + " " + userBef + " " + com + " " + comBef);
		}

	}
}
