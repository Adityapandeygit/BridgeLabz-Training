package arrays;
import java.util.*;
public class TwoDToOneDArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements:");
        for (int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;

        for (int i=0;i<rows;i++) {
            for (int j=0;j<columns;j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("1D Array elements:");
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
	}
}
