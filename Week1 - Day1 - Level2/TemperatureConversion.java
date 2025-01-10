import java.util.Scanner;

// create a class name TemperatureConversion whose purpose is to display the temprature in celcius converted into  fahrenheite.
public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Take Celsius temperature as input from the user
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitResult = (celsius * 9/5) + 32;

        //Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

    }
}
  