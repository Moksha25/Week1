import java.util.Random;

//create a class name StudentScoreCalculator used to calculate total, average, and percentage for each student.
public class StudentScoreCalculator 
{

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) 
	{
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns for Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) 
		{
            scores[i][0] = 40 + random.nextInt(61); // Physics score between 40-100
            scores[i][1] = 40 + random.nextInt(61); // Chemistry score between 40-100
            scores[i][2] = 40 + random.nextInt(61); // Math score between 40-100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) 
	{
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Columns for Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) 
		{
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) 
	{
        
        for (int i = 0; i < scores.length; i++) 
		{
            System.out.println("Student : " +(i + 1)+"Physics : "+scores[i][0]+"Chemistry : " +scores[i][1]+ "Math : " +scores[i][2] + "Total : " + results[i][0]+ "Average : " + results[i][1] + "Percentage : " + results[i][2]);
        }
    }

    public static void main(String[] args) 
	{
        int numStudents = 5; // Example: Number of students can be set dynamically
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}
