import java.util.Random;

//create a class name MatrixOperations used display a matrix 
public class MatrixOperations 
{
    // Method to create a random matrix
    public static double[][] createMatrix(int rows, int cols)
	{
        Random random = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                matrix[i][j] = random.nextInt(20) - 10; // Random numbers from -10 to 10
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) 
	{
        int rows = matrix1.length, cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] matrix1, double[][] matrix2) 
	{
        int rows = matrix1.length, cols = matrix1[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) 
	{
        int rows1 = matrix1.length, cols1 = matrix1[0].length, cols2 = matrix2[0].length;
        double[][] result = new double[rows1][cols2];
		
        for (int i = 0; i < rows1; i++) 
		{
            for (int j = 0; j < cols2; j++) 
			{
                for (int k = 0; k < cols1; k++) 
				{
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to transpose a matrix
    public static double[][] transposeMatrix(double[][] matrix) 
	{
        int rows = matrix.length, cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
		
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) 
	{
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) 
	{
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) 
	{
        double determinant = determinant2x2(matrix);
        if (determinant == 0) 
		{
            throw new ArithmeticException("Matrix is not invertible.");
        }
        double[][] inverse = 
		{
            { matrix[1][1] / determinant, -matrix[0][1] / determinant },
            { -matrix[1][0] / determinant, matrix[0][0] / determinant }
        };
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) 
	{
        double det = determinant3x3(matrix);
        if (det == 0) 
		{
            throw new ArithmeticException("Matrix is not invertible.");
        }

        double[][] adjoint = new double[3][3];
        adjoint[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjoint[0][1] = matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2];
        adjoint[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjoint[1][0] = matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2];
        adjoint[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjoint[1][2] = matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2];
        adjoint[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adjoint[2][1] = matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1];
        adjoint[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        // Calculate the inverse by dividing adjoint matrix by determinant
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) 
	{
        for (double[] row : matrix) 
		{
            for (double value : row) 
			{
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
	{
        // Example matrix operations
        double[][] matrixA = createMatrix(3, 3);
        double[][] matrixB = createMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        System.out.println("Matrix A + Matrix B:");
        displayMatrix(addMatrices(matrixA, matrixB));

        System.out.println("Matrix A - Matrix B:");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        System.out.println("Matrix A Transpose:");
        displayMatrix(transposeMatrix(matrixA));

        System.out.println("Determinant of Matrix A: " + determinant3x3(matrixA));

        try 
		{
            System.out.println("Inverse of Matrix A:");
            displayMatrix(inverse3x3(matrixA));
        } 
		catch (ArithmeticException e) 
		{
            System.out.println(e.getMessage());
        }
    }
}
