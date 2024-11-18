import java.util.Random;
public class arrrays13{
    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(2); 
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int maxOnes = 0;
        int largestRowIndex = 0;
        int largestColumnIndex = 0;
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                largestRowIndex = i;
            }
        }
        maxOnes = 0;
        for (int j = 0; j < columns; j++) {
            int count = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxOnes) {
                maxOnes = count;
                largestColumnIndex = j;
            }
        }
        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColumnIndex);
    }
}
