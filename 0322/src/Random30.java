import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Random30 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		System.out.println("몇개의 임의의 수를 만들까요?");
		int count = s.nextInt();

		int[] ranNumber = new int[count];
		int[] sortArr = new int[count];
		int[] revSortArr = new int[count];

		for (int i = 0; i < count; i++) {
			ranNumber[i] = r.nextInt(100);
		}

		System.arraycopy(ranNumber, 0, sortArr, 0, ranNumber.length);
		Arrays.sort(sortArr);

		int j = count - 1;
		for (int i = 0; i < count; i++) {
			System.arraycopy(sortArr, i, revSortArr, j, 1);
			j = j - 1;
		}
//		Arrays.sort(revSortArr, Collections.reverseOrder());

		System.out.println(Arrays.toString(ranNumber));
		System.out.println(Arrays.toString(sortArr));
		System.out.println(Arrays.toString(revSortArr));
	}
}
