import java.util.Scanner;

//create a class name SmallestNumberCheck used to check the smallest number among 3 numbers.
public class SmallestNumberCheck 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking user input for the three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Display the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

    }
}
