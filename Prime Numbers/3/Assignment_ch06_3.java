// Initially, you might think that n/2 is the upper limit for which you must test to see whether a number n is prime, but you need only go as high as the square root of n. 
// Rewrite the program, and run it both ways.

public class Assignment_ch06_3 {

	public static void main(String[] args) {
		for (int i = 2; i <= 10000; i++) {
			if (PrimeNumberTest(i) == true) {
				System.out.println(i);
			}
		}
	}
		
	public static boolean PrimeNumberTest(int n) {
		boolean index = true;
		for (int j = 2; j <= Math.sqrt(n); j++) {
			if (n % j == 0) {
				index = false;
				break;
			}
		}
		return index;
	}

}