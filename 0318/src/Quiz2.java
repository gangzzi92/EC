
public class Quiz2 {
	public static void main(String[] args) {
		int sum = 0;
		int evenSum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			}
			
			
		}
		System.out.println("전체합 : " +sum + ", 짝수합 : " + evenSum + ", 홀수합 : " + (sum - evenSum));
	}
}
