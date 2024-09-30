import java.util.Scanner; 
public class ComputeAreaWithIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        if (radius > 0) {
            double area = radius * radius * 3.14159;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
            input.close();
        } else {
            System.out.println("Negative input");
        }
    }
}
