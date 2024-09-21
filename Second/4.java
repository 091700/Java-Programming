import java.util.Scanner;
public class zy4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the miles per gallon: ");
        double fuelEfficiency = scanner.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = scanner.nextDouble();
        double gallonsNeeded = distance / fuelEfficiency;
        double cost= gallonsNeeded * pricePerGallon;
        System.out.printf("The cost of the trip is: $"+cost);
    }
}
