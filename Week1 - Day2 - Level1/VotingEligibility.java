import java.util.Scanner;

//create a class name VotingEligibility used to display that your are eligible or not for voting.
public class VotingEligibility 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking user input for age
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) 
		{
            System.out.println("The person's age is " + age + " and can vote.");
        } 
		else 
		{
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
