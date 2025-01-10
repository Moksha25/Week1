import java.util.Scanner;

//create a class name SpringSeason used to display the month is spring or not.
public class SpringSeason 
{

    public static void main(String[] args) 
	{
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking user input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Check if the date falls in the spring season (March 20 to June 20)
        boolean isSpring = 
                (month == 3 && day >= 20 && day <= 31) ||  // March 20 to March 31
                (month == 4 && day >= 1 && day <= 30) ||  // April
                (month == 5 && day >= 1 && day <= 31) ||  // May
                (month == 6 && day >= 1 && day <= 20);    // June 1 to June 20

        // Print the result based on the check
        if (isSpring) 
		{
            System.out.println("It's a Spring Season.");
        } 
		else 
		{
            System.out.println("Not a Spring Season.");
        }
    }
}
