import java.util.Scanner;

public class BMICalculator 
{
    public static String[][] calculateBMIAndStatus(double[][] data) 
	{
        String[][] result = new String[10][4];  

        for (int i = 0; i < 10; i++) 
		{
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInM = heightInCm / 100;  
            double bmi = weight / (heightInM * heightInM); 

            String status;
            if (bmi < 18.4) 
			{
                status = "Underweight";
            } 
			else if (bmi >= 18.5 && bmi <= 24.9) 
			{
                status = "Normal";
            } 
			else if (bmi >= 25 && bmi <= 29.9) 
			{
                status = "Overweight";
            } 
			else 
			{
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", heightInCm);  
            result[i][1] = String.format("%.2f", weight);      
            result[i][2] = String.format("%.2f", bmi);        
            result[i][3] = status;                             
        }
        return result;
    }

    public static void displayBMIResults(String[][] bmiData) 
	{
        for (int i = 0; i < 10; i++) 
		{
            System.out.println("Person : " + i + 1 + "Height (cm) : " + bmiData[i][0] + "Weight (kg) : " + bmiData[i][1] + " BMI : " + bmiData[i][2] + "Status : " + bmiData[i][3]); 
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];  

        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) 
		{
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
			
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiResults = calculateBMIAndStatus(data);

        displayBMIResults(bmiResults);

        sc.close();
    }
}
