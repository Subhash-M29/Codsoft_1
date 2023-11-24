package numbergame;

	import java.util.Random;
	import java.util.Scanner;

	public class Number_Game{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int minRange = 1;
	        int maxRange = 500;
	        int maxAttempts = 10;
	        int score = 0;

	        System.out.println("Number Guessing Game!");

	        do {
	            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean guessedCorrectly = false;

	            System.out.println("Guess the number between " + minRange + " and " + maxRange + ".");

	            while (attempts < maxAttempts && !guessedCorrectly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == targetNumber) {
	                    System.out.println("Congratulations...You guessed the correct number in " + attempts + " attempts.");
	                    guessedCorrectly = true;
	                  
	                    score += maxAttempts - attempts + 1; 
	                } else if (userGuess < targetNumber) {
	                    System.out.println("Too low. Try again.");
	                } else {
	                    System.out.println("Too high. Try again.");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry The correct number :" + targetNumber + ".");
	            }

	            System.out.print("Do you want to play again? yes/no: ");
	        } while (scanner.next().equalsIgnoreCase("yes"));

	        System.out.println("Thanks for playing Your total score is: " + score);

	        
	       
	    }
	}


