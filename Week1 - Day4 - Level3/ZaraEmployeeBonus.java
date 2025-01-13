import java.util.Random;

//create a class name ZaraEmployeeBonus used to calculate new salary and bonus based on years of service
public class ZaraEmployeeBonus 
{

    // Method to generate random salary and years of service
    public static int[][] generateSalaryAndService(int numEmployees) 
	{
        Random random = new Random();
        int[][] employeeData = new int[numEmployees][2]; // 2D array to store salary and years of service
        
        for (int i = 0; i < numEmployees; i++) 
		{
            // Generate random 5-digit salary and random years of service between 1 and 15
            employeeData[i][0] = 10000 + random.nextInt(90000); // Random salary between 10000 and 99999
            employeeData[i][1] = 1 + random.nextInt(15); // Random years of service between 1 and 15
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) 
	{
        double[][] resultData = new double[employeeData.length][3]; // Array to store new salary, bonus, and old salary

        for (int i = 0; i < employeeData.length; i++) 
		{
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            
            double bonus = 0;
            if (yearsOfService > 5) 
			{
                bonus = salary * 0.05; // 5% bonus
            } 
			else 
			{
                bonus = salary * 0.02; // 2% bonus
            }
            
            // New salary is the old salary plus the bonus
            double newSalary = salary + bonus;
            
            // Store old salary, bonus, and new salary
            resultData[i][0] = salary;
            resultData[i][1] = bonus;
            resultData[i][2] = newSalary;
        }
        return resultData;
    }

    // Method to calculate and display the sum of old salary, new salary, and total bonus
    public static void displayResults(double[][] resultData) 
	{
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Display header for the table
        System.out.printf("Employee"+ (i + 1) + "Old Salary" + oldSalary +"Bonus" + bonus +"New Salary" + newSalary);
        
        // Loop through each employee to display their details
        for (int i = 0; i < resultData.length; i++) 
		{
            double oldSalary = resultData[i][0];
            double bonus = resultData[i][1];
            double newSalary = resultData[i][2];

            // Accumulate total amounts
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

        }

        // Display totals
		System.out.printf("Total"+ "Total Old Salary : " + totalOldSalary + "Total bonus : " + totalBonus + "Total New Salary : " + totalNewSalary);
    }

    public static void main(String[] args) 
	{
        int numEmployees = 10; // Number of employees
        int[][] employeeData = generateSalaryAndService(numEmployees);
        double[][] resultData = calculateBonusAndNewSalary(employeeData);
        displayResults(resultData);
    }
}
