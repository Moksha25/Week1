import java.util.Scanner;

//create a class name QuotientAndReminder whose purpose is to display the quotient and reminder of the given 2 numbers.
public class QuotientAndRemainder
{
	public static void main(String[] args) 
	{
		// create a scanner to take the input
        Scanner scanner = new Scanner(System.in);

        //take input of two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Output: Display the results
        System.out.printf("The Quotient is " +  quotient + " and Remainder is " + remainder + " of two numbers " + num1 + " and " + num2);

 
    }
}
