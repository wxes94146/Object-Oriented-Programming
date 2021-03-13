import java.util.Scanner;

public class Assignment_ch03_Test {
	public static void main(String[] args) {
		Assignment_ch03 account1 = new Assignment_ch03("Jane Green", 50.00);
		Assignment_ch03 account2 = new Assignment_ch03("John Blue", -7.53);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter withdrawal amount for account1: ");
		double withdrawAmount = input.nextDouble();
		System.out.printf("%nreducing %.2f to account1 balance%n%n", withdrawAmount);
		if (withdrawAmount > account1.getBalance()) {
			System.out.println("Withdrawal amount exceeded account balance.");
		}
		account1.withdraw(withdrawAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter withdrawal amount for account2: ");
		withdrawAmount = input.nextDouble();
		System.out.printf("%nreducing %.2f to account2 balance%n%n", withdrawAmount);
		if (withdrawAmount > account2.getBalance()) {
			System.out.println("Withdrawal amount exceeded account balance.");
		}
		account2.withdraw(withdrawAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
	}
}