import java.util.Scanner;

public class FactorialUsingRecursion 
{
	public static int getInput() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
		
        return sc.nextInt();
    }

    public static long calculateFactorial(int num)
	{
        if (num == 0 || num == 1) 
		{
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }

    public static void displayResult(int num, long factorial) 
	{
        System.out.println("The factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) 
	{
        int num = getInput();

        long result = calculateFactorial(num);

        displayResult(num, result);
    }
}
