package russianroulette;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Max and Min variables.
		int min = 0;
		int max = 6;
		
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		int RANDOM_NUMBER = (int)(Math.random()*(max-min+1)+min);  
		
		System.out.println("Enter number: ");
		int USER_NUMBER = scanner.nextInt();
		scanner.nextLine();
		
		if (RANDOM_NUMBER == USER_NUMBER) {
			System.out.println("You died. The number was "+ RANDOM_NUMBER);
		}
		else if (RANDOM_NUMBER != USER_NUMBER) {
			System.out.println("You survived. The number was " + RANDOM_NUMBER);
		}

		
		
		
	}

}
