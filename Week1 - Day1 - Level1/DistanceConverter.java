import java.util.Scanner;

//creating class with name DistanceConverter indicating a purpose to display the distance converted into yards and miles.
public class DistanceConverter 
{
    public static void main(String[] args) 
	{
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
		//take input of distance in feet
		double distanceInFeet = scanner.nextDouble();
		
		// Convert the value taken in Feet into Yards and Miles
        double yards = distanceInFeet / 3;
        double miles = distanceInFeet / (3 * 1760);
		
		//display the result
		System.out.println("The distance in feet is " + distanceInFeet + " while in yards " + yards + " and miles " + miles );
	}
}