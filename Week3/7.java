public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 6;
        int b = a++; 
        int c = ++a; 
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        System.out.println("c is: " + c);
        System.out.println("--------");
        int x = 6;
        int y = x--; 
        int z = --x; 
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);
        System.out.println("z is: " + z);
    }
}
