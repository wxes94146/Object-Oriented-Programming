// Write a application and method that determines whether a number is prime.

import java.util.Scanner;

public class Assignment_ch06_1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		
		boolean index = true;
		
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				index = false;
				break;
			}
		}
		
		if (number == 1) {
			index = false;
		}
		
		if (index == true) {
			System.out.println(number + " is a prime number. ");
		}
		else {
			System.out.println(number + " is not a prime number. ");
		}
	}

}
