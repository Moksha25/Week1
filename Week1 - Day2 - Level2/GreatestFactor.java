import java.util.Scanner;

public class GreatestFactor 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the greatest factor
        int greatestFactor = 1;

        // Loop to find the greatest factor
        for (int i = number - 1; i > 0; i--) 
		{
            if (number % i == 0) 
			{
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
    }
}
