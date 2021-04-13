// Use this method in an application that determines and displays all the prime numbers less than 10,000. 
// How many numbers up to 10,000 do you have to test to ensure that you¡¦ve found all the primes?

public class Assignment_ch06_2 {
	
	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
			if (PrimeNumberTest(i) == true) {
				System.out.println(i);
			}
		}
	}
		
	public static boolean PrimeNumberTest(int n) {
		boolean index = true;
		for (int j = 2; j <= n / 2; j++) {
			if (n % j == 0) {
				index = false;
				break;
			}
		}
		return index;
	}

}