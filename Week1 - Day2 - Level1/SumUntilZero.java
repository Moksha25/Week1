import java.util.Scanner;

//create a class name sununtilzero used to display the total sum of the numbers taken input.
public class SumUntilZero 
{

    public static void main(String[] args) 
	{
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double total = 0.0;
        double userInput;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

        // Use while loop to get input until user enters 0
        while (true) 
		{
            // take input
            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble();

            // Check for exit condition
            if (userInput == 0) 
			{
                break;
            }

            // Add input to total
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum of numbers entered is: " + total);

    }
}
