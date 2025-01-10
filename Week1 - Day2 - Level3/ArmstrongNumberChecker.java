import java.util.Scanner;

public class ArmstrongNumberChecker 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        // While loop to calculate the sum of cubes of digits
        while (originalNumber != 0) 
		{
            int digit = originalNumber % 10;   // Get the last digit
            sum += Math.pow(digit, 3);        // Add cube of the digit to the sum
            originalNumber /= 10;            // Remove the last digit
        }

        // Check if the sum is equal to the original number
        if (sum == number) 
		{
            System.out.println(number + " is an Armstrong number.");
        }
		else 
		{
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
