import java.util.Scanner;

// create a class name DivisibilityCheck used to display the divisibility check of number.
public class DivisibilityCheck 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisibleBy5 = (number % 5 == 0);

        //Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleBy5);

    }
}
