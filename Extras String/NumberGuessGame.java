import java.util.*;

public class NumberGuessGame
{
	public static int GenerateGuess(int lowerBound, int upperBound)
	{
		Random random = new Random();
		
		return random.nextInt(upperBound - lowerBound + 1) + lowerBound ;
	}
	
	public static String getFeedback(int guess)
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Is the guess " + guess + "? (Enter 'high', 'low', or 'correct'):");
        return sc.nextLine().toLowerCase();
    }
	
	public static void playGame()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
		
		int lowerBound = 1;
		int upperBound = 100;
		int guess = 0;
		String feedback = "";
		
		// Loop until the computer guesses the number correctly
        while (!feedback.equals("correct")) 
		{
            guess = generateGuess(lowerBound, upperBound);
            
            feedback = getFeedback(guess);
            
            if (feedback.equals("high")) 
			{
                upperBound = guess - 1;  // The guess was too high, reduce the upper bound
            } 
			else if (feedback.equals("low")) 
			{
                lowerBound = guess + 1;  // The guess was too low, increase the lower bound
            } 
			else if (!feedback.equals("correct")) 
			{
                System.out.println("Invalid feedback, please enter 'high', 'low', or 'correct'.");
            }
        }

        // The correct guess has been made
        System.out.println("Yay! I guessed your number: " + guess);
	}
	
	public static void main(String[] args)           
	{
        // Start the game
        playGame();
    }
}