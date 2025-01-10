import java.util.Scanner;

//create a class name SimpleInterestCalculator used to display the calculated value of simple intrest.
public class SimpleInterestCalculator 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking user input for Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + ".");

    }
}
