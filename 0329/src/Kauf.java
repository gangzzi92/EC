import java.util.Scanner;

public class Kauf {
	public double height;
	public double weight;

	public void process() {
		this.iputValue();
		this.calValue();

	}

	public void iputValue() {
		Scanner s = new Scanner(System.in);
		System.out.println("키를 입력해주세요. (m)");
		this.height = s.nextDouble();
		System.out.println("몸무게를 입력해주세요. (kg)");
		this.weight = s.nextDouble();
		System.out.println("키 : " + this.height + "m  몸무게 : " + this.weight + "kg");
	}

	public void calValue() {
		double result = Math.round((this.weight / Math.pow(this.height, 2)) * 100) / 100.0;
		if (result >= 30) {
			System.out.println("카우프 지수 : " + result + "(비만)");
		} else if (result >= 24) {
			System.out.println("카우프 지수 : " + result + "(과체중)");
		} else if (result >= 20) {
			System.out.println("카우프 지수 : " + result + "(정상)");
		} else if (result >= 15) {
			System.out.println("카우프 지수 : " + result + "(저체중)");
		} else if (result >= 13) {
			System.out.println("카우프 지수 : " + result + "(여윔)");
		} else if (result >= 10) {
			System.out.println("카우프 지수 : " + result + "(영양 실조증)");
		} else {
			System.out.println("카우프 지수 : " + result + "(소모증)");
		}
	}
}
