import java.util.Scanner;
public class ReadCharFromConsole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character:");
        String s = input.nextLine();
        System.out.println("The character entered is " + s.charAt(0));
        input.close();
    }
}
