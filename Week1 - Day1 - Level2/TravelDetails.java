import java.util.Scanner;

// create a class name TravelDetails whose purpose id to display the travel details.
public class TravelDetails 
{
	public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for name and city details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the name of your starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the name of the via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the name of your final destination city: ");
        String toCity = sc.nextLine();

        // Taking user inputs for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        // Taking user input for the time taken for the journey
        System.out.print("Enter the total time taken for the journey in hours: ");
        double timeTaken = sc.nextDouble();

        // Perform some basic calculations and demonstrate operator precedence
        double totalDistance = fromToVia + viaToFinalCity; 
        double averageSpeed = totalDistance / timeTaken; 

        //Display the results
        System.out.println("Travel Details for " + name + ":");
        System.out.println("Journey from " + fromCity + " to " + viaCity + " and finally to " + toCity);
        System.out.println("Total distance covered: " + totalDistance + " miles.");
        System.out.println("Total time taken: " + timeTaken + " hours.");
        System.out.println("Average speed during the journey: " + averageSpeed + " miles per hour.");
    
    }
}
