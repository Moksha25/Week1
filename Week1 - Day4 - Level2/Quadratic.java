import java.util.Scanner;

//create a class name Quadratic  used to find the roots of the quadratic equation ax^2 + bx + c = 0
public class Quadratic 
{
    
    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c) 
	{
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        // If delta is negative, no real roots exist
        if (delta < 0) 
		{
            return new double[0]; // return an empty array
        }
        
        // If delta is zero, one real root exists
        if (delta == 0) 
		{
            double root = -b / (2 * a);
            return new double[] {root}; // return a single root
        }
        
        // If delta is positive, two real roots exist
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        return new double[] {root1, root2}; // return two roots
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        
        // Check if a is zero (invalid input for quadratic equation)
        if (a == 0) 
		{
            System.out.println("The value of 'a' cannot be zero for a quadratic equation.");
            return;
        }

        // Find the roots using the method
        double[] roots = findRoots(a, b, c);
        
        // Display the roots
        if (roots.length == 0) 
		{
            System.out.println("No real roots exist (delta is negative).");
        } 
		else if (roots.length == 1) 
		{
            System.out.println("The root is: " + roots[0]);
        } 
		else 
		{
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }

        // Close scanner
        scanner.close();
    }
}
