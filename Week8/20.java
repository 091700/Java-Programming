import java.util.Scanner;
public class zyqiyi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        double min = min(array);
        System.out.println("The minimum number is " + min);
    }

    public static double min(double[] array) {
        double smallest = array[0];
        for (double number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
}
