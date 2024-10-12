public class TriangleAngleCalculator {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        double c = 7.0;
        double angleA = calculateAngle(a, b, c);
        double angleB = calculateAngle(b, c, a);
        double angleC = calculateAngle(c, a, b);
        System.out.println(angleA);
        System.out.println(angleB ;
        System.out.println(angleC);
    }
    public static double calculateAngle(double a, double b, double c) {
        double cosValue = (b * b + c * c - a * a) / (2 * b * c);
        double angle = Math.acos(cosValue) * 180 / Math.PI;
        return angle;
    }
}
