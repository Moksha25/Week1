import java.util.Scanner;

//create a class name FactorialCalculator used to display the factorial of given number.
public class FactorialCalculator 
{

    public static void main(String[] args)
	{
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Take user input for a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = sc.nextInt();

        // Check if the input is a valid positive integer
        if (number < 0) 
		{
            System.out.println("Factorial is not defined for negative numbers.");
        } 
		else 
		{
            long factorial = 1;
            int counter = number;

            // Compute factorial using a while loop
            while (counter > 1) 
			{
                factorial *= counter;
                counter--;
            }

            //Display the result
            System.out.println("The factorial of " + number + " is " + factorial + ".");
        }
    }
}
