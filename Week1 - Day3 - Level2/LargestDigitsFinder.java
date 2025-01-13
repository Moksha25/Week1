import java.util.Scanner;

//create a class name DynamicLargestDigitsFinder used to display the result which digit is largest and second largest.
public class LargestDigitsFinder 
{

    public static void main(String[] args) 
	{
		//create a scanner object to take input.
        Scanner sc = new Scanner(System.in);

        // Define variables
        int maxDigits = 10;  // Maximum allowed digits to store
        int[] digits = new int[maxDigits];
        int index = 0;

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Extract digits and store in array
        while (number != 0) 
		{
            // Store last digit in array
            digits[index] = number % 10;
            number /= 10;
            index++;
			
            if (index == maxDigits) 
			{
                System.out.println("Maximum digit storage reached.");
                break;
            }
        }

        // Initialize largest and second largest variables
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) 
		{
            if (digits[i] > largest) 
			{
                secondLargest = largest;
                largest = digits[i];
            } 
			else if (digits[i] > secondLargest && digits[i] != largest) 
			{
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
