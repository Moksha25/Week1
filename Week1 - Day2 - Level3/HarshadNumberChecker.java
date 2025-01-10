import java.util.Scanner;

public class HarshadNumberChecker 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number to check if it's a Harshad number: ");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        // Loop to find the sum of digits
        while (number != 0) 
		{
            int digit = number % 10;   // Get the last digit
            sum += digit;               // Add the digit to sum
            number /= 10;               // Remove the last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) 
		{
            System.out.println(originalNumber + " is a Harshad number.");
        } 
		else 
		{
            System.out.println(originalNumber + " is not a Harshad number.");
        }
    }
}
