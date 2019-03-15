
public class booleanTest {
	public static void main(String[] args) {
		int a = 22;
		int b = 23;
		boolean c;

		c = a == b;
		System.out.println(c);
		c = (a != b) && (a > b);
		System.out.println(c);
		c = (a != b) || (a > b);
		System.out.println(c);
		System.out.println(a == b);

	}
}
