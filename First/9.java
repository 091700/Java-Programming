public class zy9 {
    public static void main(String[] args) {
        double km = 14.0;
        double totalTimeInMinutes = 45.0 + 30.0 / 60.0;
        double timeInHours = totalTimeInMinutes / 60.0;
        double kmToMiles = 1.6;
        double miles = km/ kmToMiles;
        double averageSpeed = miles / timeInHours;
        System.out.println("Average speed:"+averageSpeed+" miles per hour");
    }
}
