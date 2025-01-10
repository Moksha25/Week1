import java.util.Scanner;

//create a class name sumofnaturalnumber used to display the total sum of the numbers taken input.
public class SumOfNaturalNumbers
{

    public static void main(String[] args) 
	{
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);
		
		//take input
		int n = sc.nextInt();

        // Initialize variables
        int sum = 0;
		int i = 1;
		
		// use while loop to check the condition
		while (i<=n)
		{
			sum += i;
			i++;
		}
		
		// calculate the value by the formula
		int formulasum = n * (n+1) / 2 ;
		
		if (sum == formulasum)
		{
			System.out.println("Your computation are correct and match.");
		}
		else
		{
			System.out.println("Your computation are not correct.");
		}
    }
}
