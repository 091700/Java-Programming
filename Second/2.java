import java.until.Scanner;
public class zy2{
public static void main(String[] args){
Scanner input = new Scanner (System.in);
System.out.println("Enter the subtotal and a gratuity rate:");
double sub=input.nextDouble();
double rate=input.nextDouble();
double gratuity=sub*rate;
double total=sub+gratuity;
System.out.println("The gratuity is &"+gratuity+"and total is $"+total);
}
}
