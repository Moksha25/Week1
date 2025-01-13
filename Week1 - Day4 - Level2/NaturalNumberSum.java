import java.util.Scanner;

//create a class name NaturalNumberSum used to find the sum of n natural numbers using recursion
public class NaturalNumberSum 
{

    // Method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbersRecursive(int n) 
	{
        if (n <= 1) 
		{
            return n;
        } 
		else 
		{
            return n + sumOfNaturalNumbersRecursive(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula
    public static int sumOfNaturalNumbersFormula(int n) 
	{
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        // Check if the input is a natural number
        if (n <= 0) 
		{
            System.out.println("The number is not a natural number. Exiting program.");
            return;
        }

        // Compute the sum using recursion
        int recursiveSum = sumOfNaturalNumbersRecursive(n);
        
        // Compute the sum using the formula
        int formulaSum = sumOfNaturalNumbersFormula(n);
        
        // Display the results
        System.out.println("Sum of the first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of the first " + n + " natural numbers (using formula): " + formulaSum);
        
        // Compare the results
        if (recursiveSum == formulaSum) 
		{
            System.out.println("Both methods give the correct result.");
        } 
		else 
		{
            System.out.println("There is an error in the computations.");
        }

        scanner.close();
    }
}
