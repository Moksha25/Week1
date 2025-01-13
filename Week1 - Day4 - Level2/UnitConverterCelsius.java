import java.util.*;

//create a class name UnitConverterCelsius used to convert Fahrenheit to Celsius
public class UnitConverterCelsius 
{

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) 
	{
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) 
	{
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) 
	{
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) 
	{
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) 
	{
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) 
	{
        // Example usages:

        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F is equal to " + celsius + " °C.");
        
        double celsius2 = 37;
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsius2);
        System.out.println(celsius2 + " °C is equal to " + fahrenheitConverted + " °F.");
        
        double pounds = 150;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
        double kilograms2 = 68;
        double poundsConverted = convertKilogramsToPounds(kilograms2);
        System.out.println(kilograms2 + " kilograms is equal to " + poundsConverted + " pounds.");
        
        double gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
        
        double liters2 = 20;
        double gallonsConverted = convertLitersToGallons(liters2);
        System.out.println(liters2 + " liters is equal to " + gallonsConverted + " gallons.");
    }
}
