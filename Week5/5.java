import java.util.Scanner;
public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a decimal value (0 to 15): ");
            if (scanner.hasNextInt()) {
                int decimalValue = scanner.nextInt();
                if (decimalValue >= 0 && decimalValue <= 15) {
                    String hexValue = Integer.toHexString(decimalValue).toUpperCase();
                    System.out.println("The hex value is " + hexValue);
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter a decimal value between 0 and 15.");
                }
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter a decimal value between 0 and 15.");
            }
        }
    }
}
