public class z7 {
    public static void main(String[] args) {
        double a1 = 1.0;
        double p1 = 4 * (a1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        double p2 = 4 * (a1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println("First approximation of p: " + p1);
        System.out.println("Second approximation of p: " + p2);
    }
}
