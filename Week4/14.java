import java.util.Scanner;
public class NumberPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 5 == 0) {
            System.out.println("HiEven");
        }
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
