import java.util.Scanner;

//create a class name PointOperations used to calculate Euclidean distance between two points.
public class PointOperations 
{

    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) 
	{
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate the equation of a line: y = mx + b
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) 
	{
        double slope = (y2 - y1) / (x2 - x1);  // Calculate slope m
        double yIntercept = y1 - slope * x1;  // Calculate y-intercept b
        return new double[]{slope, yIntercept};  // Return array containing m and b
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Get user input for two points
        System.out.print("Enter coordinates of first point (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter coordinates of second point (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate and display Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.2f%n", distance);

        // Calculate and display the line equation
        if (x1 != x2)  // Ensure that points are not vertical to avoid division by zero
		{
			double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("Line Equation: y = " + lineEquation[0] + " + " + lineEquation[1]);
        } 
		else 
		{
            System.out.println("The line is vertical. No slope-intercept form equation.");
        }

        sc.close();
    }
}
