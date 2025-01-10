import java.util.Scanner;

public class FactorsFinder 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Display factors of the number
        System.out.println("Factors of " + number + " are: ");

        // Loop to find factors
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                System.out.print(i + " ");
            }
        }
    }
}
