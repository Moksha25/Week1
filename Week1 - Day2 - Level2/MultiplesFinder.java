import java.util.Scanner;

public class MultiplesFinder 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the number
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = sc.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Loop backward from 100 to 1 to find multiples
        for (int i = 100; i >= 1; i--) 
		{
            if (i % number == 0)
			{
                System.out.print(i + " ");
            }
        }
    }
}
