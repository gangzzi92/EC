import java.util.Arrays;
import java.util.Scanner;

public class DoubleArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("이중배열의 크기를 입력하세요");
		int size = s.nextInt();

		int[][] inputSum = new int[size][size];

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {
				int input = s.nextInt();
				inputSum[i][j] = input;
				inputSum[i][size - 1] = inputSum[i][size - 1] + input;
				inputSum[size - 1][j] = inputSum[size - 1][j] + input;
			}
			inputSum[size - 1][size - 1] = inputSum[size - 1][size - 1] + inputSum[i][size - 1];
			
		}
		for (int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(inputSum[i]));
		}
	}
}