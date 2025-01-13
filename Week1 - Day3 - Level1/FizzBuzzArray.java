import java.util.Scanner;

//Create a class name FizzBuzzArray used to display the fizz and fizzbuzz output.
public class FizzBuzzArray 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) 
		{
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        //Create an array to store the results
        String[] results = new String[number + 1];

        //Loop from 0 to the entered number and save results in the array
        for (int i = 0; i <= number; i++) 
		{
            if (i == 0) 
			{
                results[i] = "0";  // Edge case for zero
            } 
			else if (i % 3 == 0 && i % 5 == 0) 
			{
                results[i] = "FizzBuzz";
            } 
			else if (i % 3 == 0) 
			{
                results[i] = "Fizz";
            } 
			else if (i % 5 == 0) 
			{
                results[i] = "Buzz";
            } 
			else 
			{
                results[i] = Integer.toString(i);
            }
        }

        //Display the results
        System.out.println("FizzBuzz Results:");
		
        for (int i = 0; i <= number; i++) 
		{
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
