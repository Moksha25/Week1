import java.util.Scanner;

public class PowerCalculator 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get integer input for the base number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize the result variable
        int result = 1;

        // Loop to calculate power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
