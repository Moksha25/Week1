import java.util.*;

// Creating Class with name PenDistribution indicating the purpose is to display distribution of pen per student and the remaining pen not distributed .

public class PenDistribution
{
	public static void main (String args [])
	{
		// create int variable pen and student
		int pen = 14;
		int student = 3;
		
		// create double variable PenPerStudent and PenRemain
		double PenPerStudent = pen / 3;
		double PenRemain = pen % 3;
		
		//Display the result
		System.out.println("The Pen Per Student is " + PenPerStudent + " and the remaining pen not distributed is " + PenRemain);
	}
}