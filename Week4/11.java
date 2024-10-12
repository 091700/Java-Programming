public class CompoundInterestCalculator {
    public static void main(String[] args) {
        double monthlyDeposit = 100.0; 
        double annualInterestRate = 0.05; 
        double monthlyInterestRate = annualInterestRate / 12; 
        double accountValue = 0.0; 
        for (int month = 1; month <= 12; month++) {
            if (month == 1) {
                accountValue = monthlyDeposit;
                System.out.println("value becomes: " + accountValue);
            } else {
                accountValue = (accountValue + monthlyDeposit) * (1 + monthlyInterestRate);
                System.out.println("After the " + month + "the account becomes:"+accountValue);
            }
        }
    }
}
