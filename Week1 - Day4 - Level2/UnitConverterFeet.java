import java.util.*;

//create a class name  UnitConverterFeet used to convert yards to feet
public class UnitConverterFeet 
{

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) 
	{
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) 
	{
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) 
	{
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) 
	{
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) 
	{
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) 
	{
        // Example usages:
        double yards = 10;
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        
        double feet2 = 30;
        double yardsConverted = convertFeetToYards(feet2);
        System.out.println(feet2 + " feet is equal to " + yardsConverted + " yards.");
        
        double meters = 5;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");
        
        double inches2 = 50;
        double metersConverted = convertInchesToMeters(inches2);
        System.out.println(inches2 + " inches is equal to " + metersConverted + " meters.");
        
        double inches3 = 100;
        double cm = convertInchesToCentimeters(inches3);
        System.out.println(inches3 + " inches is equal to " + cm + " centimeters.");
    }
}
