import java.util.Scanner;

// create a class name TemperatureConversion whose purpose is to display the temprature in fahrenheite converted into  celcius.

public class TemperatureConversionFtoC 
{
	public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take Fahrenheit temperature as input from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

    }
}
