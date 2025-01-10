import java.util.*;

// Creating Class with name AverageMarks indicating the purpose is to display Average of marks

public class AverageMarks 
{
	public static void main (String args [])
	{
		// create int variable Maths, Physics and Chemistry
		int Maths = 94;
		int Physics = 95;
		int Chemistry = 96;
		
		// create a result variable to calculate the average of marks
		int result = (Maths + Physics + Chemistry) / 3;
		
		//Display the result
		System.out.println("Sam's average mark in PCM is " + result );
	}
}