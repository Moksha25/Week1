import java.util.Scanner;

//create a class name WeightConversion used to display the convertd value of weight into pounds.
public class WeightConversion 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking user input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = sc.nextDouble();

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds * 2.2;

        //Display the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kilograms is " + weightInKilograms + ".");
	}
}
