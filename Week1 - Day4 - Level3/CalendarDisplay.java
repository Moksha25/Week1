import java.util.Scanner;

//create a class name CalendarDisplay used to display the calendar for a given month and year
public class CalendarDisplay 
{

    // Array to store month names
    private static final String[] MONTH_NAMES = 
	{
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = 
	{
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
	{
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int month, int year) 
	{
        if (month == 1 && isLeapYear(year)) // February for leap year
		{  
			return 29;
        }
        return DAYS_IN_MONTH[month];
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) 
	{
        int d = 1;  // Start from the 1st day of the month
        int y = year;
        int m = month + 1;  // Month is zero-based, adjust for calculation

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) 
	{
        int daysInMonth = getNumberOfDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Display month and year
        System.out.println("   " + MONTH_NAMES[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first row
        for (int i = 0; i < firstDay; i++) 
		{
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) 
		{
            System.out.printf(" %3d", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) 
			{
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Get user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt() - 1;

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Validate month input
        if (month < 0 || month > 11) 
		{
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
        } 
		else 
		{
            // Display the calendar
            displayCalendar(month, year);
        }

        sc.close();
    }
}
