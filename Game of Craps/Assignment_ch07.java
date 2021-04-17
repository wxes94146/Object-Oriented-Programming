import java.security.SecureRandom;

public class Assignment_ch07 {
	public static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	private static int[] WinFrequency = new int[21];
	private static int[] LoseFrequency = new int[21];
	private static int count = 0;
	private static int countTotal = 1;
	
	public static void playCraps() {
		count = 0;
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		countTotal = countTotal + 1;
		
		switch (sumOfDice) {
		case SEVEN: // Win with 7 on first roll
		case YO_LEVEN: // Win with 11 on first roll
			gameStatus = Status.WON;
			WinFrequency[0] = WinFrequency[0] + 1;
			break;
		case SNAKE_EYES: // Lose with 2 on first roll
		case TREY: // Lose with 3 on first roll
		case BOX_CARS: // Lose with 12 on first roll
			gameStatus = Status.LOST;
			LoseFrequency[0] = LoseFrequency[0] + 1;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			//System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		while (gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			countTotal = countTotal + 1;
			count = count + 1;
			
			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
				
				if (count <= 20) {
					WinFrequency[count] = WinFrequency[count] + 1;
				}
				else {
					WinFrequency[20] = WinFrequency[20] + 1;
				}
				
			}
			else {
				if (sumOfDice == SEVEN) {
					gameStatus = Status.LOST;
					
					if (count <= 20) {
						LoseFrequency[count] = LoseFrequency[count] + 1;
					}
					else {
						LoseFrequency[20] = LoseFrequency[20] + 1;
					}
					
				}
			}
		}
		
		/*if (gameStatus == Status.WON) {
			System.out.println("Player wins");
			System.out.println();
		}
		else {
			System.out.println("Player loses");
			System.out.println();
		}*/
	}
	
	public static int rollDice() {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		//System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}
	
	public static void main(String[] args) {
		int winTotal = 0;
		
		for (int i = 1; i <= 1_000_000; i++){
			playCraps();
		}
		
		System.out.println("The games are won and lost on the first roll, second roll, ¡K,twentieth roll and after the twentieth roll:");
		
		for (int j = 0; j <= 20; j++) {
			winTotal = winTotal + WinFrequency[j];
			
			if (j == 20) {
				System.out.printf("After %02d roll: Won: %d Lost: %d%n", j, WinFrequency[j], LoseFrequency[j]);
			}
			else {
				System.out.printf("      %02d roll: Won: %d Lost: %d%n", j+1, WinFrequency[j], LoseFrequency[j]);
			}
		}
		
		double chances = (double) winTotal / 1_000_000 * 100;
		System.out.println();
		System.out.printf("The chances of winning: %.2f%%%n", chances);
		
		double averageLength = (double) countTotal / 1_000_000;
		System.out.println();
		System.out.printf("The average length: %.2f%n", averageLength);
		
		System.out.println();
		System.out.println("Do the chances of winning improve with the length of the game?");
		System.out.println("If you don¡¦t win on the first roll, the probability of losing afterwards will be very high.");
	}

}