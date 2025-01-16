import java.util.Scanner;

//create a class name factor array used to display the factors of number given by user.
public class FactorsArray 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if input is negative
        if (number <= 0) 
        {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        //Initialize variables for storing factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        //Loop to find factors and store them in the array
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                // Store factor and resize array if needed
                if (index == maxFactor) 
				{
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        //Display the factors
        System.out.print("Factors of " + number + ": ");
		
        for (int i = 0; i < index; i++) 
		{
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
