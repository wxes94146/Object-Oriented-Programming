import java.util.Scanner;

public class Assignment_ch04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int decimal = 0;
		int place = 0;
		int digit = 0;
		
		System.out.print("Enter binary number: ");
		int binary = input.nextInt();
		
		while(binary != 0){
			digit = binary % 10;
			binary = binary / 10;
			decimal += digit * Math.pow(2, place);
			place++;
		}
		
		System.out.printf("The decimal equivalent of a binary number is %d%n", decimal);
	}
}