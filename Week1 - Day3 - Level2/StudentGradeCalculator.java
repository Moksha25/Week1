import java.util.Scanner;

//create a class name StudentGradeCalculator used to display the grade according to marks.
public class StudentGradeCalculator 

{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Loop to take input for marks
        for (int i = 0; i < numberOfStudents; i++) 
		{
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input for Physics, Chemistry, and Maths marks
            for (int j = 0; j < 3; j++) 
			{
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                do 
				{
                    System.out.print(subject + " Marks (0-100): ");
                    marks[i][j] = sc.nextInt();

                    if (marks[i][j] < 0 || marks[i][j] > 100) 
					{
                        System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                    }
                } 
				
				while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) 
			{
                grades[i] = 'A';
            } 
			else if (percentages[i] >= 70) 
			{
                grades[i] = 'B';
            } 
			else if (percentages[i] >= 60) 
			{
                grades[i] = 'C';
            } 
			else if (percentages[i] >= 50) 
			{
                grades[i] = 'D';
            }
			else if (percentages[i] >= 40) 
			{
                grades[i] = 'E';
            }
			else 
			{
                grades[i] = 'R';
            }
        }

        // Display results
        for (int i = 0; i < numberOfStudents; i++) 
		{
			System.out.printf("Physics : " + marks[i][0] + "Chemistry : "+ marks[i][1] + "Maths : " + marks[i][2] +"Percentage : "+ percentages[i] + "Grade : " + grades[i]);
        }

        sc.close();
    }
}
