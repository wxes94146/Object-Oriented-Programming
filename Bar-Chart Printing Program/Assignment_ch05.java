import java.util.Scanner;

public class Assignment_ch05 {
	public static void main(String[] args) {
		String star_1 = "";
		String star_2 = "";
		String star_3 = "";
		String star_4 = "";
		String star_5 = "";
		int count = 0;
		int number_1 = 0;
		int number_2 = 0;
		int number_3 = 0;
		int number_4 = 0;
		int number_5 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five numbers between 1 and 30: ");
		
		for (int i = 1; i <= 5; i++) {
			int number = input.nextInt();
			count = count + 1;
			switch (count) {
			case 1:
				for (int j = 1; j <= number; j++) {
					star_1 = star_1 + "*";
				}
				number_1 = number;
				break;
			case 2:
				for (int j = 1; j <= number; j++) {
					star_2 = star_2 + "*";
				}
				number_2 = number;
				break;
			case 3:
				for (int j = 1; j <= number; j++) {
					star_3 = star_3 + "*";
				}
				number_3 = number;
				break;
			case 4:
				for (int j = 1; j <= number; j++) {
					star_4 = star_4 + "*";
				}
				number_4 = number;
				break;
			case 5:
				for (int j = 1; j <= number; j++) {
					star_5 = star_5 + "*";
				}
				number_5 = number;
				break;
			}
		}
		
		System.out.printf("%n%s%n%d%s%s%n%d%s%s%n%d%s%s%n%d%s%s%n%d%s%s%n",
				"Display the bars of asterisks: ", 
				number_1, ": ", star_1, 
				number_2, ": ", star_2, 
				number_3, ": ", star_3, 
				number_4, ": ", star_4, 
				number_5, ": ", star_5);
	}
}