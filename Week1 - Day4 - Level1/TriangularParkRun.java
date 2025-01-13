import java.util.Scanner;

//create a class name TriangularParkRun to calculate that how many rounds must the athelete complete.
public class TriangularParkRun 
{

    // Method to get user input for a side
    public static double getSideInput(Scanner scanner, int sideNumber) 
	{
        System.out.print("Enter the length of side " + sideNumber + " (in meters): ");
        return scanner.nextDouble();
    }

    // Method to calculate perimeter of the park
    public static double calculatePerimeter(double side1, double side2, double side3) 
	{
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed
    public static int calculateRounds(double perimeter, double distanceToRun) 
	{
    int fullRounds = (int) (distanceToRun / perimeter);
    
    // Check if there is a remainder, indicating a partial round is required
    if (distanceToRun % perimeter != 0) 
	{
        fullRounds++;
    }
    
    return fullRounds;
}
	
	 public static void main(String[] args) 
	 
	{
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for park sides
        double side1 = getSideInput(scanner, 1);
        double side2 = getSideInput(scanner, 2);
        double side3 = getSideInput(scanner, 3);

        // Calculate perimeter of the park
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculate and display the number of rounds needed
        int rounds = calculateRounds(perimeter, 5000);
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        scanner.close();
    }

}
