import java.util.Scanner;
import java.util.Random;

public class randomGuess41_RanaH{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//intitiallizing variables
		int maxGuess;
		int minGuess;
		int chances;
		int num;
		int check;
		
		//taking user input and storing them in variables
		do {
			System.out.print("Enter a minimum value for a random integer: ");
			minGuess = scanner.nextInt();
		    System.out.print("Enter a maximum value for a random integer: ");
		    maxGuess = scanner.nextInt();
		   

		    if (minGuess > maxGuess) {
		        System.out.println("Minimum cannot be greater than maximum. Try again.");
		    }
		} while (minGuess > maxGuess);
		
		System.out.print("enter the number of chances, u need to guess the right answer : ");
		chances = scanner.nextInt();
		
		//random number initialization
		num = random.nextInt(minGuess, maxGuess);
		
		
		//loop for guessing
		 for(int i = 0; i < chances; ) { // increment for valid guess
	            System.out.print("Enter your guess " + (i+1) + " : ");
	            check = scanner.nextInt();

	            if(check < minGuess || check > maxGuess) {
	                System.out.println("Guess must be between " + minGuess + " and " + maxGuess);
	                continue; // invalid input does not count
	            }

	            i++; // only count valid input
			
			if(num == check) {
				System.out.println("");
				System.out.println("you won!!!!!! correct answer"); 
				
				break;
			}
			else if(num > check) {
				System.out.println("your guess is smaller than the goal number");
			}
			else{
				System.out.println("your guess is bigger than the goal number");
			}
			
			
		}

	
		System.out.println("Right answer: " + num);
		
		
		scanner.close();
	}
}
