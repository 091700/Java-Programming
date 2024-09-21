import java.util.Scanner;
public class zy6{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        double monthlyInterestRate = 0.05 / 12;
        System.out.print("Enter the monthly saving amount: ");
        double monthlySavingAmount = scanner.nextDouble();
        double accountValue = monthlySavingAmount;
        for (int month = 2; month <= 6; month++) {
            accountValue += accountValue*monthlyInterestRate;
            accountValue += monthlySavingAmount;
        }
        System.out.printf("After the sixth month,the account value is "+accountValue);
    }
}
