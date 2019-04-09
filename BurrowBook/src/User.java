import java.util.Arrays;
import java.util.Scanner;

public class User {

	Scanner s = new Scanner(System.in);
	BookDB bookdb = new BookDB();

	public void search() {
		boolean answer = true;
		while (answer) {
			System.out.println("검색하실 도서의 제목을 입력해주세요.");
			System.out.println("1. 전체목록 확인    2. 뒤로가기");
			String input = s.nextLine();
			if (input.equals("1")) {
				System.out.println(Arrays.toString(bookdb.bookDB));
			} else if (input.equals("2")) {
				answer = false;
				break;
			} else {
				for (int i = 0; i < bookdb.bookDB.length; i++) {
					if (input.equals(bookdb.bookDB[i])) {
						System.out.println(i + 1 + "번째에 있습니다.");
						break;
					} else if (i == bookdb.bookDB.length - 1) {
						System.out.println("검색결과가 없습니다.");
					}
				}
			}
		}
	}

	public void rental() {
		boolean answer = true;
		while (answer) {
			System.out.println("대여하실 도서의 제목을 입력해주세요.");
			System.out.println("1. 대여가능 목록 확인    2. 대여목록  확인   3. 뒤로가기");
			String input = s.nextLine();
			if (input.equals("1")) {
				if (bookdb.currDB.length == 0) {
					System.out.println("대여가능한 도서가 없습니다.");
				} else {
					System.out.println(Arrays.toString(bookdb.currDB));
				}
			} else if (input.equals("2")) {
				if (bookdb.rentalDB.length == 0) {
					System.out.println("대여된 도서가 없습니다.");
				} else {
					System.out.println(Arrays.toString(bookdb.rentalDB));
				}
			} else if (input.equals("3")) {
				answer = false;
				break;
			} else if ((bookdb.currDB.length == 0)) {
				System.out.println("대여가능한 도서가 없습니다.");
			} else {
				for (int i = 0; i < bookdb.currDB.length; i++) {
					if (input.equals(bookdb.currDB[i])) {
						String[] tempRental = new String[bookdb.rentalDB.length + 1];
						System.arraycopy(bookdb.rentalDB, 0, tempRental, 0, bookdb.rentalDB.length);
						tempRental[bookdb.rentalDB.length] = input;
						bookdb.rentalDB = tempRental;

						String[] tempCurr = new String[bookdb.currDB.length - 1];
						System.arraycopy(bookdb.currDB, 0, tempCurr, 0, i);
						System.arraycopy(bookdb.currDB, i + 1, tempCurr, i, tempCurr.length - (i));
						bookdb.currDB = tempCurr;
						break;
					} else if (i == bookdb.currDB.length - 1) {
						System.out.println("대여가능한 도서가 없습니다.");
					}
				}

			}
		}
	}

	public void returnBook() {
		boolean answer = true;
		while (answer) {
			System.out.println("반납하실 도서의 제목을 입력해주세요.");
			System.out.println("1. 미반납 도서 확인    2. 뒤로가기");
			String input = s.nextLine();
			if (input.equals("1")) {
				if (bookdb.rentalDB.length == 0) {
					System.out.println("미반납 도서가 없습니다.");
				} else {
					System.out.println(Arrays.toString(bookdb.rentalDB));
				}
			} else if (input.equals("2")) {
				answer = false;
				break;
			} else if ((bookdb.rentalDB.length == 0)) {
				System.out.println("미반납 도서가 없습니다.");
			} else {
				for (int i = 0; i < bookdb.rentalDB.length; i++) {
					if (input.equals(bookdb.rentalDB[i])) {
						String[] tempRental = new String[bookdb.rentalDB.length - 1];
						System.arraycopy(bookdb.rentalDB, 0, tempRental, 0, i);
						System.arraycopy(bookdb.rentalDB, i + 1, tempRental, i, tempRental.length - (i));
						bookdb.rentalDB = tempRental;
										
						String[] tempCurr = new String[bookdb.currDB.length + 1];
						System.arraycopy(bookdb.currDB, 0, tempCurr, 0, bookdb.currDB.length);
						tempCurr[bookdb.currDB.length] = input;
						bookdb.currDB = tempCurr;
						break;
					} else if (i == bookdb.rentalDB.length - 1) {
						System.out.println("미반납 도서가아닙니다.");
					}
				}
			}
		}
	}
}
