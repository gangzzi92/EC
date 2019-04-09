import java.util.Scanner;

public class testgogogogo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세욤");
		int input = scan.nextInt();
		int tmpInput = input;
		String bin = "";
		String revBin = "";
		int rest = 0;
		while (tmpInput > 0) {
			rest = tmpInput % 2;
			revBin = revBin + String.valueOf(rest);
			tmpInput = tmpInput / 2;
		}
		for (int i = revBin.length() - 1; i >= 0; i--) {
			bin = bin + revBin.charAt(i);
		}
		System.out.println("2진수 : " + bin);

//		String oct = "";
//		String revoct = "";
//		tmpInput = input;
//		while (tmpInput > 0) {
//			rest = tmpInput % 8;
//			revoct = revoct + String.valueOf(rest);
//			tmpInput = tmpInput / 8;
//		}
//		for (int i = revoct.length() - 1; i >= 0; i--) {
//			oct = oct + revoct.charAt(i);
//		}
//		System.out.println("8진수 : " + oct);
//		
//		String hex = "";
//		String revHex = "";
//		tmpInput = input;
//		while (tmpInput > 0) {
//			rest = tmpInput % 16;
//		if (rest>=10) {
//			rest = rest  + 55;
//			revHex = revHex + String.valueOf((char)rest);
//		} else {
//			revHex = revHex + String.valueOf(rest);
//		}
//
//			tmpInput = tmpInput / 16;
//		}
//		for (int i = revHex.length() - 1; i >= 0; i--) {
//			hex = hex + revHex.charAt(i);
//		}
//		System.out.println("16진수 : " + hex);
		
		
		int count = 0;
		String tmprevBin = revBin;
		if (revBin.length() % 3 != 0) {
			while (revBin.length() % 3!= 0) {
				tmprevBin = tmprevBin + 0;
			}
			String[] hexArray = new String[tmprevBin.length()/3];

		}
		
	}
}
