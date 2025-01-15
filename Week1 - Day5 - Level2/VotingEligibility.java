import java.util.Scanner;
import java.util.Random;

public class VotingEligibility 
{
    public static int[] generateAges(int numberOfStudents) 
	{
        int[] ages = new int[numberOfStudents];
        Random random = new Random();

        for (int i = 0; i < numberOfStudents; i++) 
		{
            ages[i] = random.nextInt(82) + 18; 
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) 
	{
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) 
		{
            String canVote = "Cannot Vote"; 
            if (ages[i] >= 18) 
			{
                canVote = "Can Vote"; 
            }
            eligibility[i][0] = String.valueOf(ages[i]); 
            eligibility[i][1] = canVote; 
        }

        return eligibility;
    }

    public static void displayEligibility(String[][] eligibility) 
	{
        for (int i = 0; i < eligibility.length; i++) 
		{
            System.out.printf("Student Age : "+ eligibility[i][0] + "Voting Eligibility : " + eligibility[i][1]);
        }
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        final int numberOfStudents = 10;

        int[] ages = generateAges(numberOfStudents);

        String[][] eligibility = checkVotingEligibility(ages);

        displayEligibility(eligibility);

        sc.close();
    }
}
