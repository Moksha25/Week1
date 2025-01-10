import java.util.Scanner;

//create a class name NumberCheck used to check the number is positive, negative, or zero.
public class NumberCheck 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) 
		{
            System.out.println("The number is positive.");
        } 
		else if (number < 0) 
		{
            System.out.println("The number is negative.");
        } 
		else 
		{
            System.out.println("The number is zero.");
        }
    }
}
