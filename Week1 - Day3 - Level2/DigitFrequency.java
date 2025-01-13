import java.util.Scanner;

//create a class name digitfrequency used to disply the frequency of each digit.
public class DigitFrequency 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //Take input for a number
        System.out.print("Enter a positive number: ");
        long number = sc.nextLong();

        // Validate input for negative numbers
        while (number < 0) 
		{
            System.out.println("Please enter a positive number.");
            System.out.print("Enter a positive number: ");
            number = sc.nextLong();
        }

        //Define a frequency array to store counts of digits 0-9
        int[] frequency = new int[10];

        //Extract digits and compute their frequencies
        long tempNumber = number;
		
        while (tempNumber > 0) 
		{
            int digit = (int) (tempNumber % 10);  // Get the last digit
            frequency[digit]++;                  // Increase count for this digit
            tempNumber /= 10;                    // Remove the last digit
        }

        //Display the frequency of each digit
        System.out.println("\nDigit Frequencies:");
		
        for (int i = 0; i < 10; i++) 
		{
            if (frequency[i] > 0) 
			{
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
