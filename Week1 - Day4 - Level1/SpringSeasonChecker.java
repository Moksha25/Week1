import java.util.Scanner;

//create a class name SpringSeasonChecker used to display the it's spring season or not.
public class SpringSeasonChecker 
{

    // Method to check if the given month and day fall in Spring Season
    public static boolean isSpringSeason(int month, int day) 
	{
        // Check for valid spring dates
        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) || 
            (month == 5 && day >= 1 && day <= 31) || 
            (month == 6 && day >= 1 && day <= 20)) 
		{
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Get user input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Check and display result
        if (isSpringSeason(month, day)) 
		{
            System.out.println("It's a Spring Season!");
        } 
		else 
		{
            System.out.println("Not a Spring Season.");
        }

        scanner.close();
    }
}
