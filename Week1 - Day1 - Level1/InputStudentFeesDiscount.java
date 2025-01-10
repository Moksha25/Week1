import java.util.*;

// Creating Class with name InputStudentFeesDiscount indicating the purpose is to display the discounted amount and discounted price the student will pay for the course.

public class InputStudentFeesDiscount
{
	public static void main (String args [])
	{
		//create scanner to take input 
		Scanner sc = new Scanner(System.in);
		
		//take the value of student fees in int  variable
		int studentfees = sc.nextInt();
		
		// create double variable discountamount and finaldiscountfee
		double discountamount = studentfees * 10/100 ;
		double finaldiscountfee = studentfees - discountamount ;
		
		//Display the result
		System.out.println("The discount amount is INR " + discountamount + " and final discounted fee is INR " + finaldiscountfee);
	}
}