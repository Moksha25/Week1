import java.util.Scanner;
import java.util.Arrays;

//create a class name DynamicLargestDigitsFinder used to display the result which digit is largest and second largest.
public class DynamicLargestDigitsFinder 
{

    public static void main(String[] args) 
	{
		//create a scanner object to take input.
        Scanner sc = new Scanner(System.in);

        // Initial array size to store digits
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Extract digits and store in the array, dynamically expanding when needed
        while (number != 0) 
		{
            // Check if the array needs resizing
            if (index == maxDigits) 
			{
                maxDigits += 10;
                digits = Arrays.copyOf(digits, maxDigits);
            }

            // Store last digit in array
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Initialize variables to find largest and second-largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second-largest digits
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
