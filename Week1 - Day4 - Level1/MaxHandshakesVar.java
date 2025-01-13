import java.util.Scanner;

//create a class name MaxHandshakesVar used to calculate the maximum handshakes.
public class MaxHandshakesVar 
{

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Get input for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = (n * (n - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);

        scanner.close();
    }
}
