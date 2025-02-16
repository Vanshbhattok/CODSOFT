import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) 
    
    {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int minNum = 1;
        int maxNum = 100;
        int maxAttempts = 10;

      
        int secretNumber = random.nextInt(maxNum - minNum + 1) + minNum;

        System.out.println("******************************************************");
        System.out.println("Welcome!!! to the Number Game.");

        System.out.println("******************************************************");

        System.out.println("Guess a number between " + minNum + " and " + maxNum + ".");

        System.out.println("******************************************************");

        System.out.println("You have " + maxAttempts + " attempts to guess the number.");

        System.out.println("******************************************************\n");

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (attempts < maxAttempts) 
        
        {
            attempts++;

            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < secretNumber) 
            {
                System.out.println("Too low! Try again.");
            } 
            else if (guess > secretNumber) 
            {
                System.out.println("Too high! Try again.");
            } 
            else 
            {   
                
                System.out.println("******************************************************");
                System.out.println("Congratulations! You guessed the correct number: " + secretNumber + ".");
                hasGuessedCorrectly = true;
                break;
            }
        }
        System.out.println("******************************************************");

        if (!hasGuessedCorrectly) {

            System.out.println("******************************************************");
            System.out.println("Out of attempts! The correct number was " + secretNumber + ".");
            System.out.println("******************************************************");

        }
        
        scanner.close();
    }
}