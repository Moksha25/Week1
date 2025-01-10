import java.util.*;

// Creating Class with name AreaOfTriangle indicating the purpose is to display the are of traingle in cm and inches.

public class AreaOfTriangle
{
	public static void main (String args [])
	{
		//create scanner to take input 
		Scanner sc = new Scanner(System.in);
		
		//take the value of base and height in int variable 
		int baseininches = sc.nextInt();
		int heightininches = sc.nextInt();
		
		//calculate the area of triangle in square inches
		double areainsquareinches = 0.5 * baseininches * heightininches;
		
		//convert base and height into centimeters
		double baseincm = baseininches * (double)2.54 ;
		double heightincm = heightininches * (double)2.54 ;
		
		//calculate the area in square centimeters
		double areainsquarecm = 0.5 * baseincm * heightincm;
		
		//Display the result
		System.out.println(" Area of traingle in square inches is " + areainsquareinches + " and in square centimeter is " + areainsquarecm);
	}
}