//12
public class main{
    public static void MAin(String[] args) {
        int count = 0; 
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) { 
                    System.out.println();
                }}}
        if (count % 10 != 0) {
            System.out.println();
        }}
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        return true;
    }}}
