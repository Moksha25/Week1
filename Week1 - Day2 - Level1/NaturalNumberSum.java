import java.util.Scanner;

//create a class name NaturalNumberSum used to display the sum of all the natural numbers taken from user.
public class NaturalNumberSum 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number >= 0) 
		{
            // Calculate the sum of n natural numbers using the formula n * (n + 1) / 2
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum + ".");
        } 
		else 
		{
            // Output if the number is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
