import java.util.*;

//create a class name EvenOdd used to display the given number is odd or even.
public class EvenOdd 
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		//take the input of number
		System.out.println("Enter Positive Number : ");
		int number = sc.nextInt();
		
		// Check if the input is a valid natural number
        if (number <= 0) 
		{
            System.out.println("Please enter a natural number greater than 0.");
        }
		else 
		{
            // Iterate from 1 to the user-entered number
            System.out.println("Odd and Even numbers from 1 to " + number + ":");
            for (int i = 1; i <= number; i++) 
			{
                if (i % 2 == 0) 
				{
                    System.out.println(i + " is an even number.");
                } 
				else 
				{
                    System.out.println(i + " is an odd number.");
                }
            }
        }
	}
}
