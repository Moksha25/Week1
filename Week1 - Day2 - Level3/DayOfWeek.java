import java.util.Scanner;

public class DayOfWeek 
{
    public static void main(String[] args) 
	{
        // Take input for month, day, and year
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter month (1 for January, 2 for February, etc.): ");
        int m = sc.nextInt();
        
        System.out.print("Enter day(0 for Sunday, 1 for Monday, 2 for Tuesday, etc): ");
        int d = sc.nextInt();
        
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Applying the formula for the Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);

    }
}
