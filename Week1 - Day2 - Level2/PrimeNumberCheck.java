import java.util.Scanner;

//create a class name PrimeNumberCheck used to display the number is prime or not.
public class PrimeNumberCheck 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Take integer input from the user
        System.out.print("Enter a number to check if it's a prime number: ");
        int number = sc.nextInt();

        // Initialize boolean to store the prime status
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) 
		{
            isPrime = false;
        } 
		else 
		{
            // Loop through numbers from 2 to sqrt(number) for efficiency
            for (int i = 2; i <= Math.sqrt(number); i++) 
			{
                if (number % i == 0) 
				{
                    isPrime = false;  // Set false if divisible by any number other than 1 and itself
                    break;
                }
            }
        }

        // Display the result
        if (isPrime) 
		{
            System.out.println(number + " is a prime number.");
        } 
		else 
		{
            System.out.println(number + " is not a prime number.");
        }
    }
}
