import java.util.*;

//create a class name voting eligibility used to display that a person is eligible for voting 
public class VotingEligibility 
{
	public static void main (String args[])
	{
		//create a scanner object to take input
		Scanner sc = new Scanner (System.in);
		
		int age[] = new int[10];
		
		// loop to find the age is a natural number
		for (int i=0; i < age.length; i++)
		{
			//Take student input
				System.out.println("Enter the age " + (i+1) + " : ");            
				
				age[i] = sc.nextInt();
		
			if (age[i] < 0 )            // check If the age is a negative number
			{
				System.out.println(" Invalid age of student : " + (i + 1) + " is " + age);
				i--;                     //decremnet the value to take student age again
				continue;                 // continue to take the age again
			}
			
			if (age[i] > 18)              //check if the age is above 18 or not 
			{
				System.out.println("The student with age " + age + " can vote.");
			}
			else
			{
				System.out.println("The student with age " + age + " cannot vote.");
			}
		}
	}
}