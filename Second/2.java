import java.until.Scanner;
public class zy2{
public static void main(String[] args){
Scanner input1 = new Scanner (System.in);
Scanner input2 = new Scanner (System.in);
double sub=input1.nextDouble();
double rate=input2.nextDouble();
double gratuity=sub*rate;
double total=sub+gratuity;
System.out.println("Enter the subtotal and a gratuity rate:");
 System.out.println("The gratuity is &"+gratuity+"and total is $"+total);
}
}
