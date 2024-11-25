// 3
package package1;

public class class1 {
    public int x = 5;
    public int y = 10; 

    void m1() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        System.out.println("This is main method of class-1");
        class1 c1 = new class1();
        c1.m1(); 
    }
}
