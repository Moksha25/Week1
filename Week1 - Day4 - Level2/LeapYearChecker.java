import java.util.Scanner;

//create a class name LeapYearChecker used to check if a year is a leap year.
public class LeapYearChecker 
{

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
	{
        // Year should be >= 1582 (Gregorian calendar start year)
        if (year < 1582) 
		{
            return false;
        }
        
        // Leap year logic:
        // Divisible by 4 but not divisible by 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
		{
            return true;
        } 
		else 
		{
            return false;
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Take user input for year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the entered year is a leap year
        if (isLeapYear(year)) 
		{
            System.out.println(year + " is a Leap Year.");
        } 
		else 
		{
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}
