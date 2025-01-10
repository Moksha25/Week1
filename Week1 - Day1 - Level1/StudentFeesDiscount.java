import java.util.*;

// Creating Class with name StudentFeesDiscount indicating the purpose is to display the discounted amount and discounted price the student will pay for the course.

public class StudentFeesDiscount
{
	public static void main (String args [])
	{
		// create int variable Studentfees
		int studentfees = 125000;
		
		// create double variable discountamount and finaldiscountfee
		double discountamount = studentfees * 10/100 ;
		double finaldiscountfee = studentfees - discountamount ;
		
		//Display the result
		System.out.println("The discount amount is INR " + discountamount + " and final discounted fee is INR " + finaldiscountfee);
	}
}