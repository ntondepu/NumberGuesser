import java.util.Random;
import java.util.Scanner;

public class NumGuess{
	public static void numGame(){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int lowestVal = 1;
		int upperVal = 100;
		int numToGuess = random.nextInt(upperVal - lowerVal);
		int numofGuess = 0;
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("I'm thinking of a number between 1 and 100.");

		while (true){
			System.out.println("Enter your guess");
			int guess = scanner.nextInt();
			numofGuess++;

			if (guess < numToGuess){
				System.out.println("Too low!");
			}else if (guess > numToGuess){
				System.out.println("Too high!");
			}else{
				System.out.println("Congrats! You guessed the number!");
				break;
			}			
		}
		scanner.close();
	}	
}
