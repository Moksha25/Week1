import java.util.Scanner;

//create a class name SimpleInterestCalculator used to calculate the simple intrest.
public class SimpleInterestCalculator 
{

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) 
	{
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Taking input for principal, rate, and time
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.printf("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time + " years.");

        scanner.close();
    }
}
