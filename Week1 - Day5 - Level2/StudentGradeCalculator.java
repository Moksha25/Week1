import java.util.Random;

public class StudentGradeCalculator 
{
    public static int[][] generateScores(int numStudents) 
	{
        int[][] scores = new int[numStudents][3];
        Random random = new Random();

        for (int i = 0; i < numStudents; i++) 
		{
            scores[i][0] = random.nextInt(100); 
            scores[i][1] = random.nextInt(100); 
            scores[i][2] = random.nextInt(100); 
        }

        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numStudents) 
	{
        double[][] results = new double[numStudents][4]; 

        for (int i = 0; i < numStudents; i++) 
		{
            int total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 300.0) * 100; 

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    public static String[] calculateGrade(double[][] results, int numStudents) 
	{
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) 
		{
            double percentage = results[i][2];

            if (percentage >= 80) 
			{
                grades[i] = "A";
            } 
			else if (percentage >= 70) 
			{
                grades[i] = "B";
            } 
			else if (percentage >= 60) 
			{
                grades[i] = "C";
            } 
			else if (percentage >= 50) 
			{
                grades[i] = "D";
            } 
			else if (percentage >= 40) 
			{
                grades[i] = "E";
            } 
			else 
			{
                grades[i] = "R";
            }
        }

        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] results, String[] grades, int numStudents) 
	{
        for (int i = 0; i < numStudents; i++) 
		{
            System.out.println("Student : " + i+1 + "Physics : " + scores[i][0] + "Chemistry : " + scores[i][1] + "Maths : " + scores[i][2] + "Total : " + results[i][0] + "Average : " + results[i][1] + "Percentage : " + results[i][2] + "Grade : " + grades[i]);
		}
	}

    public static void main(String[] args) 
	{
        final int numStudents = 10; 

        int[][] scores = generateScores(numStudents);

        double[][] results = calculateTotalAveragePercentage(scores, numStudents);

        String[] grades = calculateGrade(results, numStudents);

        displayScoreCard(scores, results, grades, numStudents);
    }
}
