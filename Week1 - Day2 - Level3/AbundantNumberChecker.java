import java.util.Scanner;

public class AbundantNumberChecker 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number to check if it's an Abundant number: ");
        int number = sc.nextInt();

        // Initialize variable for the sum of divisors
        int sum = 0;

        // Loop to find the sum of divisors
        for (int i = 1; i < number; i++) 
		{
            if (number % i == 0)     // Check if i is a divisor of number
			{
                sum += i;            // Add i to the sum
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > number) 
		{
            System.out.println(number + " is an Abundant number.");
        } 
		else 
		{
            System.out.println(number + " is not an Abundant number.");
        }
    }
}
