//Task12
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();
        printMonth(year, month);
    }
    public static void printMonth(int year, int month) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear && month == 2) {
            daysInMonth[2] = 29;
        }
        int dayOfWeek = getDayOfWeek(year, month, 1);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%2d ", day);
            if ((day + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); 
    }
OfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int k = year % 100;
        int j = year / 100;
        int dayOfWeek = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
        return dayOfWeek;
    }
}
