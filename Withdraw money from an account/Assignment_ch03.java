public class Assignment_ch03 {
	private String name;
	private double balance;
	
	public Assignment_ch03(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
		}
		
		if (withdrawAmount > balance) {
			balance = balance;
		}
	}
	
	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}