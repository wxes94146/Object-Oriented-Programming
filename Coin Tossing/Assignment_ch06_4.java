import java.util.Scanner;
import java.security.SecureRandom;

public class Assignment_ch06_4 {
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args) {
		int number = 0;
		
		while (number != -1) {
			Scanner input = new Scanner(System.in);
		    System.out.print("Enter the number of times to toss or -1 to quit: ");
		    number = input.nextInt();
		    
		    int heads_count = 0;
		    int tails_count = 0;
		    
		    for (int i = 1; i <= number; i++) {
			    if (flip() == true) {
				    heads_count = heads_count + 1;
			    }
			    else {
				    tails_count = tails_count + 1;
			    }
		    }
		    
		    if (number > 0) {
		    	System.out.println(heads_count + " HEADS " + tails_count + " TAILS ");
		    	System.out.println();
		    }
		}
		
	}
	
	public static boolean flip() {
		int roll = randomNumbers.nextInt(2);
		boolean result = true;
		if (roll != 0) {
			result = false;
		}
		return result;
	}

}