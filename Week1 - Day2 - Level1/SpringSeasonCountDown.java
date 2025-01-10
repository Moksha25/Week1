import java.util.Scanner;

//create a class name SpringSeasonCountDown used to display the month is spring or not.
public class SpringSeasonCountDown
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking user input for countdown start value
        System.out.print("Enter a number to start the countdown: ");
        int counter = sc.nextInt();

        // Countdown using a for-loop
        System.out.println("Countdown starts:");
		
        for (int i = counter; i >= 1; i--) 
		{
            System.out.println(i);
        }

        System.out.println("Countdown complete!");
    }
}
