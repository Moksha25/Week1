import java.util.Scanner;

//create a class name TriangularParkRun used to display the total number of rounds an athelete needs to complete a 5 km run.
public class TriangularParkRun 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters
        double targetDistance = 5000;  // 5 km in meters

        // Calculate the number of rounds the athlete must complete
        double rounds = targetDistance / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

    }
}
