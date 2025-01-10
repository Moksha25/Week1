import java.util.Scanner;

//create a class name EmployeeBonus used to display the bonus of the employee of each year.
public class EmployeeBonus 
{

    public static void main(String[] args) 
	{
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Get the salary and years of service from the user
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        // Initialize the bonus variable
        double bonus = 0.0;

        // Calculate bonus based on years of service
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% bonus for more than 5 years of service
        }

        // Print the bonus amount
        System.out.println("The bonus for an employee with " + yearsOfService + " years of service is: " + bonus);
	}
}
