import java.util.Scanner;

//create a class name NumberCheck to displaythe number is positive, negative or zero.
public class NumberCheck 
{

    // Method to check number status
    public int checkNumber(int number) 
	{
        if (number > 0) 
		{
            return 1;  // Positive number
        } 
		else if (number < 0) 
		{
            return -1; // Negative number
        } 
		else 
		{
            return 0;  // Zero
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        NumberCheck numberCheck = new NumberCheck();
        
        // Get user input
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();

        // Call method and display result
        int result = numberCheck.checkNumber(userInput);
        switch (result) 
		{
            case 1:
                System.out.println("The number is positive.");
                break;
				
            case -1:
                System.out.println("The number is negative.");
                break;
				
            case 0:
                System.out.println("The number is zero.");
                break;
        }

        scanner.close();
    }
}
