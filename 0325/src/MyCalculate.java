import java.util.Scanner;

public class MyCalculate {
	public void hundredSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}

	public void primeNumber() {
		Scanner s = new Scanner(System.in);
		System.out.println("검사할 숫자를 입력해주세요.");
		int inputNumber = s.nextInt();

		if (inputNumber < 1) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		boolean isPrimeNumber = true;
		for (int i = 2; i < inputNumber; i++) {
			if (inputNumber % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		if (isPrimeNumber) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	}

	public void printPrime() {
		boolean checkPrime = true;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					checkPrime = false;
				}
			}
			if (checkPrime) {
				
				System.out.print(i+" ");
			}else {
				checkPrime = true;
			}
		}
		System.out.println("끝");
	}

	public void multipleNumber() {
		Scanner s2 = new Scanner(System.in);
		int inputNum = s2.nextInt();
		System.out.println(inputNum + "의 배수는");
		for (int i = 1; i <= 100 / inputNum; i++) {
			System.out.print(inputNum * i + " ");
		}
	}

	public static void main(String[] args) {
		MyCalculate mc = new MyCalculate();
		mc.hundredSum();
		mc.primeNumber();
		mc.printPrime();
		mc.multipleNumber();
	}
}