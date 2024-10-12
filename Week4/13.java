import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double tax = purchaseAmount * 0.06;
        double roundedTax = Math.round(tax * 100.0) / 100.0;
        System.out.println("Sales tax is: $" + roundedTax);
    }
}
