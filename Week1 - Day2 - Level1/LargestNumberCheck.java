import java.util.Scanner;

//create a class name LargestNumberCheck  used to check the largest number among 3 numbers.
public class LargestNumberCheck 
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

        // Check if the first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        
        // Output the result for the first number being the largest
        System.out.println("Is the first number the largest? " + isFirstLargest);

        // Check if the second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        
        // Output the result for the second number being the largest
        System.out.println("Is the second number the largest? " + isSecondLargest);

        // Check if the third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);
        
        // Display the result for the third number being the largest
        System.out.println("Is the third number the largest? " + isThirdLargest);
	}
}
