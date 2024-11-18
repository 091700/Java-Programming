import java.util.Random;
public class arrrays14{
    public static void shuffle(int[][] m) {
        Random random = new Random();
        int rows = m.length;
        int[] indices = new int[rows];
        for (int i = 0; i < rows; i++) {
            indices[i] = i;
        }
        for (int i = rows - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = indices[i];
            indices[i] = indices[j];
            indices[j] = temp;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int temp = m[i][j];
                m[i][j] = m[indices[i]][j];
                m[indices[i]][j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] m = {
            {1, 2},
            {3, 4},
            {5, 6},
            {7, 8},
            {9, 10}
        };
        System.out.println("Original matrix:");
        printMatrix(m);
        shuffle(m);
        System.out.println("\nShuffled matrix:");
        printMatrix(m);
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
