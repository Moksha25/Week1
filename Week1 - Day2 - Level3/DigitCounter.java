import java.util.Scanner;

public class DigitCounter 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer to count its digits: ");
        int number = sc.nextInt();

        // Initialize the count variable
        int count = 0;
        int originalNumber = number;

        // Handle zero input case
        if (number == 0) 
		{
            count = 1;
        } 
		else 
		{
            // Loop to count digits
            while (number != 0) 
			{
                number /= 10;  // Remove the last digit
                count++;       // Increment count
            }
        }

        // Display the result
        System.out.println("The number of digits in " + originalNumber + " is: " + count);
    }
}
