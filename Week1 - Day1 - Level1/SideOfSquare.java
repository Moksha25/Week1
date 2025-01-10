import java.util.*;

//creating class with name SideOfSquare indicating a purpose to display the side of square whose parameter is taken from user.

public class SideOfSquare 
{
	public static void main (String args [])
	{
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
		
		//take input the parameter of square
		double parameter = scanner.nextDouble();
		
		// Calculate the side of the square
        double side = parameter / 4;
		
		//display the result
		 System.out.printf("The length of the side is " + side + " whose parameter is " + parameter);
	}
}