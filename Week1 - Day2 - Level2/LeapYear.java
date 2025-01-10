import java.util.Scanner;

//create a class name LeapYear used to display the entered year is leapyear or not.
public class LeapYear 
{

    public static void main(String[] args) 
	{
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Get user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the year is >= 1582 (Gregorian calendar)
        if (year < 1582) 
		{
            System.out.println("Year should be greater than or equal to 1582.");
        } 
		else 
		{
            // Check if the year is a leap year using multiple if-else statements
            if (year % 400 == 0) 
			{
                System.out.println(year + " is a Leap Year.");
            } 
			else if (year % 100 == 0) 
			{
                System.out.println(year + " is not a Leap Year.");
            } 
			else if (year % 4 == 0)
			{
                System.out.println(year + " is a Leap Year.");
            } 
			else 
			{
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}
