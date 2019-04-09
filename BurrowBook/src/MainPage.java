import java.util.Arrays;
import java.util.Scanner;

public class MainPage {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookDB bookdb = new BookDB();
		User user = new User();

		while (true) {
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 검색    2. 대여    3. 반납    4. 종료    5. 관리자");
			String input = s.nextLine();
			if ((input.equals("1")) || (input.equals("검색"))) {
				user.search();
			} else if ((input.equals("2")) || (input.equals("대여"))) {
				user.rental();
			} else if ((input.equals("3")) || (input.equals("반납"))) {
				user.returnBook();
			} else if ((input.equals("4")) || (input.equals("종료"))) {
				break;
			} else if ((input.equals("5")) || (input.equals("관리자"))) {

			} else {
				System.out.println("정확히 입력해주세요.");
			}
		}

//		String[] a = { "1", "2", "3", "4", "5" };
//		String[] b = { "a", "b", null, "d" };
//		String[] c = new String[3];
//		System.arraycopy(b, 0, c, 0, b.length);
//		System.out.println(Arrays.toString(c));
	}
}
