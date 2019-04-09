
public class MBox {
	public int totalCoin = 0;
	public String name;

	public void withdraw() {
		System.out.println(name + "출금액 : " + totalCoin);
		totalCoin = 0;
	}

	public void setName(String inputName) {
		name = inputName;
	}

	public void deposit(int inputCoin) {
		totalCoin = totalCoin + inputCoin;
	}

}
