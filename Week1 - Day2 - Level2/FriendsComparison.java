import java.util.Scanner;

public class FriendsComparison 
{

    public static void main(String[] args) 
	{
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get age and height inputs for Amar, Akbar, and Anthony
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
		
        System.out.print("Enter Amar's height in cm: ");
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
		
        System.out.print("Enter Akbar's height in cm: ");
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
		
        System.out.print("Enter Anthony's height in cm: ");
        double heightAnthony = scanner.nextDouble();

        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend;

        if (youngestAge == ageAmar) 
		{
            youngestFriend = "Amar";
        } 
		else if (youngestAge == ageAkbar) 
		{
            youngestFriend = "Akbar";
        } 
		else 
		{
            youngestFriend = "Anthony";
        }

        // Find the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend;

        if (tallestHeight == heightAmar) 
		{
            tallestFriend = "Amar";
        }
		else if (tallestHeight == heightAkbar) 
		{
            tallestFriend = "Akbar";
        } 
		else 
		{
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");
    }
}
