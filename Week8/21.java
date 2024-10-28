import java.util.Scanner;
public class zyqier{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Reversed order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
