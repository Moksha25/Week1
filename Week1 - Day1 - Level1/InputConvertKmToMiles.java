import java.util.*;

// Creating Class with name InputConvertKmToMiles indicating the purpose is to take input from user and  display the conversion of kilometer into miles 

public class InputConvertKmToMiles
{
	public static void main (String args [])
	{
		//create scanner to take input 
		Scanner sc = new Scanner(System.in);
		
		//take the value of distance in km variable
		double km = sc.nextDouble();
		
		// create double variable mile for conversion
		double mile = km / (double)1.6 ;
		
		//Display the result
		System.out.println("The total miles is " + mile + " mile for the given " + km + " km.");
	}
}