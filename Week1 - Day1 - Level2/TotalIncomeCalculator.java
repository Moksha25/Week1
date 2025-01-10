import java.util.Scanner;

//create a class name TotalIncomeCalculator whose purpose is to display the total income of the  person.
public class TotalIncomeCalculator 
{
	public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take salary as input from the user
        System.out.print("Enter your salary (INR): ");
        double salary = sc.nextDouble();

        // Take bonus as input from the user
        System.out.print("Enter your bonus (INR): ");
        double bonus = sc.nextDouble();

        // Calculate total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome + ".");

    }
}
