import java.util.Scanner;
public class arrrays12{
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;
        for (double[] row : m) {
            sum += row[columnIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            double sum = sumColumn(matrix, i);
            System.out.println("Sum of the elements at column " + i + " is " + sum);
        }
        scanner.close();
    }
}
