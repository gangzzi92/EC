import java.util.Scanner;

public class jwMission {
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

		String oct = "";
		String revoct = "";
		tmpInput = input;
		while (tmpInput > 0) {
			rest = tmpInput % 8;
			revoct = revoct + String.valueOf(rest);
			tmpInput = tmpInput / 8;
		}
		for (int i = revoct.length() - 1; i >= 0; i--) {
			oct = oct + revoct.charAt(i);
		}
		System.out.println("8진수 : " + oct);

		String hex = "";
		String revHex = "";
		tmpInput = input;
		while (tmpInput > 0) {
			rest = tmpInput % 16;
			if (rest >= 10) {
				rest = rest + 55;
				revHex = revHex + String.valueOf((char) rest);
			} else {
				revHex = revHex + String.valueOf(rest);
			}

			tmpInput = tmpInput / 16;
		}
		for (int i = revHex.length() - 1; i >= 0; i--) {
			hex = hex + revHex.charAt(i);
		}
		System.out.println("16진수 : " + hex);

		String tmprevBin = "";
		tmprevBin = revBin;
		while (tmprevBin.length() % 3 != 0) {
			tmprevBin = tmprevBin + "0";
		}
		String[] octArrays = new String[tmprevBin.length() / 3];
		int count = tmprevBin.length() / 3;
		for (int i = 0; i < count; i++) {
			octArrays[i] = tmprevBin.substring(0, 3);
			tmprevBin = tmprevBin.substring(3);
		}
		for (int i = 0; i < count; i++) {
			octArrays[i] = String.valueOf((Integer.parseInt(octArrays[i].substring(0, 1)) * 1)
					+ (Integer.parseInt(octArrays[i].substring(1, 2)) * 2)
					+ (Integer.parseInt(octArrays[i].substring(2)) * 4));
		}
		String oct2 = "";
		for (int i = count - 1; i >= 0; i--) {
			oct2 = oct2 + octArrays[i];
		}
		System.out.println("8진수 : " + oct2);

		tmprevBin = revBin;
		while (tmprevBin.length() % 4 != 0) {
			tmprevBin = tmprevBin + "0";
		}
		String[] hexArrays = new String[tmprevBin.length() / 4];
		count = tmprevBin.length() / 4;
		for (int i = 0; i < count; i++) {
			hexArrays[i] = tmprevBin.substring(0, 4);
			tmprevBin = tmprevBin.substring(4);
		}
		for (int i = 0; i < count; i++) {
			hexArrays[i] = String.valueOf((Integer.parseInt(hexArrays[i].substring(0, 1)) * 1)
					+ (Integer.parseInt(hexArrays[i].substring(1, 2)) * 2)
					+ (Integer.parseInt(hexArrays[i].substring(2, 3)) * 4)
					+ (Integer.parseInt(hexArrays[i].substring(3)) * 8));
		}
		for (int i = 0; i < count; i++) {
			if (Integer.parseInt(hexArrays[i])>=10) {
				hexArrays[i] = String.valueOf((char)(Integer.parseInt(hexArrays[i]) + 55));
			}
		}	
		String hex2 = "";
		for (int i = count - 1; i >= 0; i--) {
			hex2 = hex2 + hexArrays[i];
		}
		System.out.println("16진수 : " + hex2);
	}
}
