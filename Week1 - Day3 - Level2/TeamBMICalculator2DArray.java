import java.util.Scanner;

//create a class name TeamBMICalculator2DArray used to calculate the bmi of a person.
public class TeamBMICalculator2DArray 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input for height and weight
        for (int i = 0; i < number; i++) 
		{
            System.out.println("Person " + (i + 1) + ":");

            // Input and validation for weight
            do 
			{
                System.out.print("Enter weight (in kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) 
				{
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } 
			
			while (personData[i][0] <= 0);

            // Input and validation for height
            do 
			{
                System.out.print("Enter height (in cm): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) 
				{
                    System.out.println("Height must be positive. Please enter again.");
                }
            } 
			
			while (personData[i][1] <= 0);

            // Convert height to meters
            double heightInMeters = personData[i][1] / 100;

            // Calculate BMI and store in array
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters);

            // Determine weight status
            if (personData[i][2] < 18.5) 
			{
                weightStatus[i] = "Underweight";
            } 
			else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) 
			{
                weightStatus[i] = "Normal weight";
            } 
			else if (personData[i][2] >= 25 && personData[i][2] < 29.9) 
			{
                weightStatus[i] = "Overweight";
            } 
			else 
			{
                weightStatus[i] = "Obesity";
            }
        }

        // Display results using tab-separated format
		System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");

		for (int i = 0; i < number; i++) 
		{
			System.out.println(personData[i][1] + "\t\t" + personData[i][0] + "\t\t" + personData[i][2] + "\t\t" + weightStatus[i]);
		}

        sc.close();
    }
}
