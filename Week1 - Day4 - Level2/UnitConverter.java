import java.util.*;

//create a class name UnitConverter used to convert kilometers to miles.
public class UnitConverter 
{

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) 
	{
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) 
	{
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) 
	{
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) 
	{
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) 
	{
        // Example usages:
        double kilometers = 10;
        double miles = convertKmToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        
        double miles2 = 10;
        double kilometersConverted = convertMilesToKm(miles2);
        System.out.println(miles2 + " miles is equal to " + kilometersConverted + " kilometers.");
        
        double meters = 100;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        
        double feet2 = 100;
        double metersConverted = convertFeetToMeters(feet2);
        System.out.println(feet2 + " feet is equal to " + metersConverted + " meters.");
    }
}
