import java.util.Scanner;

public class AdminMenu {

	public void password () {
		Scanner scan = new Scanner(System.in);
		String inputPwd = "";
		String pwd = "gkgk";
		System.out.println("비밀번호를 입력하세요.");
		for (int i =0; i<3; i++) {
			inputPwd = scan.nextLine();
			if (inputPwd.equals(pwd)) {
				
			}
		}
	}
	


}
