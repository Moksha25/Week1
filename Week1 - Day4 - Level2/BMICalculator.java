import java.util.Scanner;

//create a class name BMICalculator used to calculate BMI for each person
public class BMICalculator 
{

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] personData) 
	{
        for (int i = 0; i < personData.length; i++) 
		{
            double weight = personData[i][0]; // weight in kg
            double heightInCm = personData[i][1]; // height in cm
            double heightInMeters = heightInCm / 100; // converting cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI calculation
            personData[i][2] = bmi; // store BMI in the third column
        }
    }

    // Method to determine BMI status for each person
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) 
		{
            double bmi = personData[i][2]; // BMI value
            if (bmi < 18.5) 
			{
                status[i] = "Underweight";
            } 
			else if (bmi >= 18.5 && bmi < 24.9) 
			{
                status[i] = "Normal weight";
            } 
			else if (bmi >= 25 && bmi < 29.9) 
			{
                status[i] = "Overweight";
            } 
			else 
			{
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Create a 2D array to store weight, height, and BMI for 10 people
        double[][] personData = new double[10][3]; // 10 persons, 3 columns (weight, height, bmi)
        
        // Input weight and height for each person
        for (int i = 0; i < 10; i++) 
		{
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble(); // weight
            System.out.print("Enter height (cm): ");
            personData[i][1] = scanner.nextDouble(); // height
        }

        // Calculate BMI for each person
        calculateBMI(personData);

        // Determine BMI status for each person
        String[] status = determineBMIStatus(personData);

        // Display the results
        for (int i = 0; i < 10; i++) 
		{
            System.out.printf("Height(cm) : "+ personData[i][1] + "Weight(kg) : "+ personData[i][0] +"BMI : " + personData[i][2] + "Status : " + status[i]);
        }

        // Close scanner
        scanner.close();
    }
}
