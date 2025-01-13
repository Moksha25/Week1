import java.util.Scanner;

//create a class name FriendFinder used to find the youngest friend.
public class FriendFinder 
{

    // Method to find the youngest friend
    public String findYoungest(int[] ages) 
	{
        int minAge = ages[0];
        String youngestFriend = "Amar"; // Assuming Amar is the youngest initially

        // Check for youngest friend based on age
        if (ages[1] < minAge) 
		{
            minAge = ages[1];
            youngestFriend = "Akbar";
        }
        if (ages[2] < minAge) 
		{
            minAge = ages[2];
            youngestFriend = "Anthony";
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public String findTallest(double[] heights) 
	{
        double maxHeight = heights[0];
        String tallestFriend = "Amar"; // Assuming Amar is the tallest initially

        // Check for tallest friend based on height
        if (heights[1] > maxHeight) 
		{
            maxHeight = heights[1];
            tallestFriend = "Akbar";
        }
        if (heights[2] > maxHeight) 
		{
            maxHeight = heights[2];
            tallestFriend = "Anthony";
        }
        return tallestFriend;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        FriendFinder friendFinder = new FriendFinder();

        // Arrays to store ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for ages of the 3 friends
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
		
        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
		
        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();

        // Input for heights of the 3 friends
        System.out.print("Enter height of Amar in meters: ");
        heights[0] = scanner.nextDouble();
		
        System.out.print("Enter height of Akbar in meters: ");
        heights[1] = scanner.nextDouble();
		
        System.out.print("Enter height of Anthony in meters: ");
        heights[2] = scanner.nextDouble();

        // Find the youngest and tallest friends using methods
        String youngest = friendFinder.findYoungest(ages);
        String tallest = friendFinder.findTallest(heights);

        // Display results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
