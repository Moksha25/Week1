import java.util.Scanner;

//create a class name TrigonometricFunctions  used to calculate various trigonometric functions (sine, cosine, and tangent)
public class TrigonometricFunctions 
{

    // Method to calculate various trigonometric functions (sine, cosine, and tangent)
    public static double[] calculateTrigonometricFunctions(double angle) 
	{
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate the trigonometric functions
        double sine = Math.sin(radians);   // Sine of the angle
        double cosine = Math.cos(radians); // Cosine of the angle
        double tangent = Math.tan(radians); // Tangent of the angle
        
        // Return the results in an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Get user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Call the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine of " + angle + ":" + results[0]);
        System.out.printf("Cosine of " + angle + ":" + results[1]);
        System.out.printf("Tangent of " + angle + ":" + results[2]);

        scanner.close();
    }
}
