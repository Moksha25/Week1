import java.util.Scanner;

public class StudentVoteChecker 
{

    // Method to check if a student can vote
    public boolean canStudentVote(int age) 
	{
        // Check for negative age value
        if (age < 0) 
		{
            return false; // Invalid age, cannot vote
        }
        // Check if age is 18 or above
        return age >= 18; // If age is greater or equal to 18, return true
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Input loop to get ages from the user
        for (int i = 0; i < 10; i++) 
		{
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();

            // Call canStudentVote() and display result
            if (voteChecker.canStudentVote(studentAges[i])) 
			{
                System.out.println("Student " + (i + 1) + " can vote.");
            } 
			else 
			{
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        scanner.close();
    }
}
