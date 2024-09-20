import java.until.Scanner;
public class Main{
public static void main(String[] args){
final double PI=3.1415926;
Scanner input = new Scanner (System.in);
System.out.println(Enter a number for radius:");
double radius=input.nextDoublr();
double area=radius*radius*PI;
System.out.println("The area for the circle of radius"+radius+"is"+area);
}
}