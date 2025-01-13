import java.util.Scanner;

//create a class name HandshakeCalculator used to calculate the maximumnumber of handshakes.
public class HandshakeCalculator 
{

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) 
	{
        if (n < 2) 
		{
            return 0; // No handshake possible if fewer than 2 students
        }
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Calculate maximum number of handshakes
        int handshakes = calculateHandshakes(n);

        // Display the result
        System.out.println("The maximum number of handshakes possible is: " + handshakes);

        scanner.close();
    }
}
