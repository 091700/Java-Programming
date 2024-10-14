//14
public class TuitionCalculator {
    public static void main(String[] args) {
        double initialTuition = 10000.0;
        double doubledTuition = initialTuition * 2; 
        double annualIncreaseRate = 0.07; 
        int years = 0;
        while (initialTuition < doubledTuition) {
            initialTuition += initialTuition * annualIncreaseRate; 
            years++; 
        }
        System.out.println("Tuition will be doubled in " + years + " years.");
        System.out.printf("Tuition will be $%.2f in %d years.\n", initialTuition, years);
    }
}
