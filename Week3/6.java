public class AugmentedOperator {
    public static void main(String[] args) {
        double a = 6.5;
        a = a + a + 6;
        System.out.println("The value of a without augmented operator is: " + a);
        double b = 6.5;
        b += b + 6;
        System.out.println("The value of b with augmented operator is: " + b); 
        double c = 4;
        c /= 2; 
        System.out.println("The value of c with augmented operator is: " + c);
    }
}
