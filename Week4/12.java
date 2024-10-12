import java.util.Scanner;
public class LotteryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits):");
        String userInput = scanner.next(); 
        int userPick = Integer.parseInt(userInput); 
        int presetNumber = 15;
        if (userPick >= 10 && userPick <= 99) { 
            if (userPick == presetNumber) {
                System.out.println("The lottery number is " + presetNumber);
                System.out.println("Exact match: you win $10,000");
            } else if (String.valueOf(userPick).contains(String.valueOf(presetNumber / 10)) || 
                       String.valueOf(userPick).contains(String.valueOf(presetNumber % 10))) {
                System.out.println("The lottery number is " + presetNumber);
                System.out.println("Match one digit: you win $1,000");
            } else {
                System.out.println("The lottery number is " + presetNumber);
                System.out.println("Match all digits: you win $3,000"); 
            }
        } else {
            System.out.println("Error: Please enter a two-digit number.");
        }
    }
}
