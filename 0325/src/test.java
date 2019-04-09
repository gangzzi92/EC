public class test {
	String name;
	String mane;
	int a;

	test(String b) {
		this.name = b + "123";
	}

	public String toString() {
		return this.name;
	}

	public static void main(String[] args) {
		test[] arr = new test[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new test((i + 1) + "빠따");
			arr[i].a = 1;
			arr[i].mane = "mane";
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
