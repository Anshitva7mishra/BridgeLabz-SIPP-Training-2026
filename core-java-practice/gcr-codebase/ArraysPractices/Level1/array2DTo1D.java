import java.util.Scanner;

public class array2DTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        
        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        int[] array1D = new int[rows * columns];
        int index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1D[index] = matrix[i][j];
                index++;
            }
        }
        
        System.out.println("1D Array:");
        for (int i = 0; i < index; i++) {
            System.out.print(array1D[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}
