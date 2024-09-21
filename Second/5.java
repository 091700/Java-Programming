import java.util.Scanner;
public class zy5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of the side: ");
    double sideLength = scanner.nextDouble();
    double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
    System.out.println("The area of the hexagon is "+area);
}
}
