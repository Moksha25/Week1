import java.util.Scanner;

//create a class name Copy2DArrayTo1D  used to display the result that the 2D array is copied to the 1D array.
public class Copy2DArrayTo1D 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
		
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        //Create a 2D array
        int[][] matrix = new int[rows][columns];

        //Take user input to fill the 2D array
        System.out.println("Enter elements of the matrix:");
		
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Create a 1D array to copy elements
        int[] array = new int[rows * columns];
        int index = 0;

        //Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                array[index++] = matrix[i][j];
            }
        }

        //Display the 1D array
        System.out.println("Copied 1D Array:");
		
        for (int i = 0; i < array.length; i++) 
		{
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
