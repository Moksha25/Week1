import java.util.Scanner;

//create a class name NaturalNumberSum used to display the sum of natural numbers.
public class NaturalNumberSum 
{

    // Method to calculate sum of n natural numbers
    public static int findSum(int n) 
	{
        int sum = 0;
        for (int i = 1; i <= n; i++) 
		{
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Get user input for n
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        // Validate input
        if (n <= 0) 
		{
            System.out.println("Please enter a positive integer.");
        } 
		else 
		{
            // Calculate and display the sum
            int sum = findSum(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        scanner.close();
    }
}
