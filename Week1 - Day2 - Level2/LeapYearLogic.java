import java.util.Scanner;

//create a class name LeapYearLogic used to display the entered year is leapyear or not.
public class LeapYearLogic
{

    public static void main(String[] args) 
	{
        // Create a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Get user input for the year
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Using a single if statement with multiple logical conditions
        if ((year >= 1582) && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))) 
		{
            System.out.println(year + " is a Leap Year.");
        } 
		else 
		{
            System.out.println(year + " is not a Leap Year.");
        }
    }
}