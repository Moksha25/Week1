import java.util.Scanner;

//create a class name CollinearPointsChecker used to check collinearity using area of triangle formula
public class CollinearPointsChecker 
{

    // Method to check collinearity using slope formula
    public static boolean arePointsCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) 
	{
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean arePointsCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3)
	{
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Get user input for three points
        System.out.print("Enter coordinates for point A (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter coordinates for point B (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter coordinates for point C (x3, y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check collinearity using both methods
        boolean collinearSlope = arePointsCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = arePointsCollinearArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Collinear using slope method: " + collinearSlope);
        System.out.println("Collinear using area method: " + collinearArea);

        sc.close();
    }
}
