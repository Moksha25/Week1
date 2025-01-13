import java.util.Scanner;

//create a class name QuotientAndRemainder used to find the quotient and remainder.
public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
        int[] result = new int[2]; // Array to store quotient and remainder
        
        // Calculate the quotient and remainder
        int quotient = number / divisor;
        int remainder = number % divisor;
        
        // Store the results in the array
        result[0] = quotient;  // quotient
        result[1] = remainder; // remainder
        
        return result;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number and divisor
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Call the method to find the quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        scanner.close();
    }
}
