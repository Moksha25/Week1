import java.util.Scanner;

//create a class name WindChillCalculator used to calculate the wind chill temperature using the formula.
public class WindChillCalculator 
{

    // Method to calculate the wind chill temperature using the formula
    public static double calculateWindChill(double temperature, double windSpeed) 
	{
        // Formula for wind chill
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Get user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();

        // Check if the inputs are valid for calculating wind chill
        if (temperature > 50 || windSpeed < 3) 
		{
            System.out.println("Wind chill formula is only valid for wind speeds of 3 mph or more and temperatures below 50°F.");
        } 
		else 
		{
            // Calculate wind chill using the method
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display the wind chill temperature
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }

        scanner.close();
    }
}
