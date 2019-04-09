
public class NumberTotal {
	public static void main(String[] args) {
		int total = 0;
		int evenTotal = 0;
		int oddTotal = 0;
		
		for (int i = 0; i <= 100; i++) {
			total = total + i;
			if (i % 2 == 0) {
				evenTotal = evenTotal +i;
			}
//				else {
//				oddTotal = oddTotal + number;
//			}
		}
		oddTotal = total - evenTotal;
		System.out.println("총합은 " + total);
		System.out.println("홀수 총합은 " + oddTotal);
		System.out.println("짝수 총합은 " + evenTotal);
	}
}
