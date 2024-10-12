import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.println("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.printf("BMI is %.4f\n", bmi);
    }
}
