import java.util.Scanner;
public class PentagonAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length：");
        double r = scanner.nextDouble();
        double s = 2 * Math.sin(Math.PI / 5) * r;
        double area = 5*s*s/(4*Math.tan(Math.PI/5));
        System.out.println("the area is"+area);
    }
}
