import java.util.*;

//create a class name GradeResult used to display the grades on the basis of marks.
public class GradeResult
{
	public static void main (String args [])
	{
		//create a scanner to get the input
		Scanner sc = new Scanner(System.in);
		
		//create int variable to take input
		System.out.println("Enter physic marks : ");
		int physic = sc.nextInt();
		
		System.out.println("Enter chemistry marks : ");
		int chemistry = sc.nextInt();
		
		System.out.println("Enter maths marks : ");
		int maths = sc.nextInt();
		
		int average = (physic + chemistry + maths) / 3 ;
		
		if (average >= 80 )
		{
			System.out.println("Your average mark is " + average +" and your grade is A - above agency-normalized standards");
		}
		else if(average >= 70)
		{
			System.out.println("Your average mark is " + average + " and your grade is B - at agency-normalized standards");
		}
		else if(average >= 60)
		{
			System.out.println("Your average mark is " + average + " and your grade is C - below, but approaching agency-normalized standards");
		}
		else if(average >= 50)
		{
			System.out.println("Your average mark is " + average + " and your grade is D - well below agency-normalized standards");
		}
		else if(average >= 40)
		{
			System.out.println("Your average mark is " + average + " and your grade is E - too below agency-normalized standards");
		}
        else
		{
			System.out.println("Your average mark is " + average + "Remedial standards");
		}
	}
}