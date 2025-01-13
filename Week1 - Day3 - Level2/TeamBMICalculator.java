import java.util.Scanner;

//create a class name TeamBMICalculator used to calculate the bmi of person.
public class TeamBMICalculator 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Arrays to store data
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Input for height and weight
        for (int i = 0; i < n; i++) 
		{
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            weights[i] = sc.nextDouble();
            
            System.out.print("Enter height (in cm): ");
            heights[i] = sc.nextDouble();

            // Convert height to meters
            heights[i] /= 100;

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status
            if (bmis[i] < 18.5) 
			{
                statuses[i] = "Underweight";
            } 
			else if (bmis[i] >= 18.5 && bmis[i] < 24.9) 
			{
                statuses[i] = "Normal weight";
            } 
			else if (bmis[i] >= 25 && bmis[i] < 29.9) 
			{
                statuses[i] = "Overweight";
            } 
			else 
			{
                statuses[i] = "Obesity";
            }
        }

        // Display results
        System.out.printf("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
		
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i] * 100, weights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }
}
