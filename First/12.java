public class zy12 {
    public static void main(String[] args) {
        double miles = 24.0;
        double totalTimeInMinutes = 60+40+35.0/60.0;
        double timeInHours = totalTimeInMinutes / 60.0;
        double m= 1.6;
        double k= miles * m;
        double averageSpeed = k/timeInHours;
        System.out.println("Average speed: " + averageSpeed + " kilometers per hour");
    }
}
