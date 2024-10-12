import java.util.Scanner;
public class HexagonAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the length of the side: ");
        double sideLength = scanner.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
        System.out.println("the area is: " + area);
    }
}
