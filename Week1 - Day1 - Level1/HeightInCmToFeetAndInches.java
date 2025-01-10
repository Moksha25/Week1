import java.util.*;

// Creating Class with name HeightInCmToFeetAndInches indicating the purpose is to display the conversion of height in cm into feet into inches.

public class HeightInCmToFeetAndInches
{
	public static void main (String args [])
	{
		//create scanner to take input 
		Scanner sc = new Scanner(System.in);
		
		//take the value of student fees in int  variable
		int height = sc.nextInt();
		
		// create double variable feet and inches
		double feet = height / ((double)2.54 * 12) ;
		double inches = height / (double)2.54;
		
		//Display the result
		System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inches);
	}
}