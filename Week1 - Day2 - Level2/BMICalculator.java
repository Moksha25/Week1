import java.util.Scanner;

public class BMICalculator 
{

    public static void main(String[] args) 
	{
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for weight and height
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert height from cm to meters
        double heightMeters = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeters * heightMeters);

        // Display BMI result
        System.out.printf("Your BMI is: "+ bmi);

        // Determine weight status
        if (bmi < 18.4) 
		{
            System.out.println("You are Underweight.");
        } 
		else if (bmi >= 18.4 && bmi < 24.9) 
		{
            System.out.println("You have a Normal weight.");
        } 
		else if (bmi >= 25 && bmi < 39.9) 
		{
            System.out.println("You are Overweight.");
        } 
		else 
		{
            System.out.println("You are Obese.");
        }
    }
}
