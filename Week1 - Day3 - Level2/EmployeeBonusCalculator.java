import java.util.Scanner;

//create a class name EmployeeBonusCalculator used to calculate the bonus of employee based on their year of experience.
public class EmployeeBonusCalculator 
 {
    public static void main(String[] args) 
	{
        //Define constants
        final int EMPLOYEES = 10;
        final double BONUS_RATE_ABOVE_5_YEARS = 0.05;
        final double BONUS_RATE_BELOW_5_YEARS = 0.02;

        // Initialize arrays and variables
        double[] salaries = new double[EMPLOYEES];
        int[] yearsOfService = new int[EMPLOYEES];
        double[] bonuses = new double[EMPLOYEES];
        double[] newSalaries = new double[EMPLOYEES];
		
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

		//create a scanner object to take input.
        Scanner sc = new Scanner(System.in);

        // Input loop to get salary and years of service
        for (int i = 0; i < EMPLOYEES; i++) 
		{
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Get valid salary input
            while (true) 
			{
                System.out.print("Enter salary: ");
                salaries[i] = sc.nextDouble();
				
                if (salaries[i] > 0) 
					break;
				
                System.out.println("Invalid input. Salary must be a positive number.");
            }

            // Get valid years of service input
            while (true) 
			{
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextInt();
				
                if (yearsOfService[i] >= 0) 
					break;
				
                System.out.println("Invalid input. Years of service cannot be negative.");
            }
        }

        // Calculation loop for bonus, new salary, and totals
        for (int i = 0; i < EMPLOYEES; i++) 
		{
            double bonusRate = yearsOfService[i] > 5 ? BONUS_RATE_ABOVE_5_YEARS : BONUS_RATE_BELOW_5_YEARS;
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];

            // Update totals
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("Employee Salary and Bonus Details.");
		
        for (int i = 0; i < EMPLOYEES; i++) 
		{
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + salaries[i]);
            System.out.println("  Years of Service: " + yearsOfService[i]);
            System.out.println("  Bonus: " + bonuses[i]);
            System.out.println("  New Salary: " + newSalaries[i]);
        }

        // Print total amounts
        System.out.println("Company Summary.");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary Amount: " + totalOldSalary);
        System.out.println("Total New Salary Amount: " + totalNewSalary);
    }
}
